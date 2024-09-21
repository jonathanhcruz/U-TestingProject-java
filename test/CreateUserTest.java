import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateUserTest {
    @Test
    void isValidUser_AllValidFields_ReturnsTrue() {
      CreateUser user = new CreateUser("123", "JohnDoe", 0, 100);
      assertTrue(user.isValidUser());
    }

    @Test
    void isValidUser_InvalidCodeOfEmployee_ReturnsFalse() {
      CreateUser user = new CreateUser("12A", "JohnDoe", 0, 100);
      assertFalse(user.isValidUser());
    }

    @Test
    void isValidUser_InvalidName_ReturnsFalse() {
      CreateUser user = new CreateUser("123", "John$Doe", 0, 100);
      assertFalse(user.isValidUser());
    }

    @Test
    void isValidUser_InvalidTypeUser_ReturnsFalse() {
      CreateUser user = new CreateUser("123", "JohnDoe", 2, 100);
      assertFalse(user.isValidUser());
    }

    @Test
    void isValidUser_InvalidTimeOnCompany_ReturnsFalse() {
      CreateUser user = new CreateUser("123", "JohnDoe", 0, 601);
      assertFalse(user.isValidUser());
    }

    @Test
    void isValidUser_EmptyName_ReturnsFalse() {
      CreateUser user = new CreateUser("123", "", 0, 100);
      assertFalse(user.isValidUser());
    }

    @Test
    void isValidUser_NameAtMaxLength_ReturnsTrue() {
      CreateUser user = new CreateUser("123", "JohnDoeJohnDoeJohnDoeJohnDoe", 0, 100);
      assertTrue(user.isValidUser());
    }

    @Test
    void isValidUser_TimeAtLowerBoundary_ReturnsTrue() {
      CreateUser user = new CreateUser("123", "JohnDoe", 0, 1);
      assertTrue(user.isValidUser());
    }

    @Test
    void isValidUser_TimeAtUpperBoundary_ReturnsTrue() {
      CreateUser user = new CreateUser("123", "JohnDoe", 0, 600);
      assertTrue(user.isValidUser());
    }
}