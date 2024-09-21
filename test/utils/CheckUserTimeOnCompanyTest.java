package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckUserTimeOnCompanyTest {
    @org.junit.jupiter.api.Test
    void isValidTimeOnCompany_ValidTime_ReturnsTrue() {
      CheckUserTimeOnCompany userTime = new CheckUserTimeOnCompany(100);
      assertTrue(userTime.isValidTimeOnCompany());
    }

    @org.junit.jupiter.api.Test
    void isValidTimeOnCompany_TimeTooShort_ReturnsFalse() {
      CheckUserTimeOnCompany userTime = new CheckUserTimeOnCompany(0);
      assertFalse(userTime.isValidTimeOnCompany());
    }

    @org.junit.jupiter.api.Test
    void isValidTimeOnCompany_TimeTooLong_ReturnsFalse() {
      CheckUserTimeOnCompany userTime = new CheckUserTimeOnCompany(601);
      assertFalse(userTime.isValidTimeOnCompany());
    }

    @org.junit.jupiter.api.Test
    void isValidTimeOnCompany_TimeAtLowerBoundary_ReturnsTrue() {
      CheckUserTimeOnCompany userTime = new CheckUserTimeOnCompany(1);
      assertTrue(userTime.isValidTimeOnCompany());
    }

    @org.junit.jupiter.api.Test
    void isValidTimeOnCompany_TimeAtUpperBoundary_ReturnsTrue() {
      CheckUserTimeOnCompany userTime = new CheckUserTimeOnCompany(600);
      assertTrue(userTime.isValidTimeOnCompany());
    }
}