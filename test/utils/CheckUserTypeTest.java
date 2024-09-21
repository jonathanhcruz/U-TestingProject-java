package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckUserTypeTest {
    @org.junit.jupiter.api.Test
    void isValidTypeUser_ValidTypeZero_ReturnsTrue() {
      CheckUserType userType = new CheckUserType(0);
      assertTrue(userType.isValidTypeUser());
    }

    @org.junit.jupiter.api.Test
    void isValidTypeUser_ValidTypeOne_ReturnsTrue() {
      CheckUserType userType = new CheckUserType(1);
      assertTrue(userType.isValidTypeUser());
    }

    @org.junit.jupiter.api.Test
    void isValidTypeUser_InvalidNegativeType_ReturnsFalse() {
      CheckUserType userType = new CheckUserType(-1);
      assertFalse(userType.isValidTypeUser());
    }

    @org.junit.jupiter.api.Test
    void isValidTypeUser_InvalidPositiveType_ReturnsFalse() {
      CheckUserType userType = new CheckUserType(2);
      assertFalse(userType.isValidTypeUser());
    }
}