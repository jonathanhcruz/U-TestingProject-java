package utils;

import static org.junit.jupiter.api.Assertions.*;

class CheckUserNameTest {
  @org.junit.jupiter.api.Test
  void isValidName_ValidName_ReturnsTrue() {
    boolean userName = new CheckUserName("JohnDoe").isValidName();
    assertTrue(userName);
  }

  @org.junit.jupiter.api.Test
  void isValidName_EmptyName_ReturnsFalse() {
    boolean userName = new CheckUserName("").isValidName();
    assertFalse(userName);
  }

  @org.junit.jupiter.api.Test
  void isValidName_NameWithSpecialChars_ReturnsFalse() {
    boolean userName = new CheckUserName("John$Doe").isValidName();
    assertFalse(userName);
  }

  @org.junit.jupiter.api.Test
  void isValidName_NameTooLong_ReturnsFalse() {
    boolean userName = new CheckUserName("JohnDoeJohnDoeJohnDoeJohnDooeoy").isValidName();
    assertFalse(userName);
  }


  @org.junit.jupiter.api.Test
  void isValidName_NameAtMaxLength_ReturnsTrue() {
    boolean userName = new CheckUserName("JohnDoeJohnDoeJohnDoeJohnDoe").isValidName();
    assertTrue(userName);
  }
}
