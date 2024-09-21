package utils;

import static org.junit.jupiter.api.Assertions.*;

class CheckUserCodeTest {
    @org.junit.jupiter.api.Test
    void isValidCodeOfEmployee() {
        CheckUserCode checkUserCode = new CheckUserCode("000");
        assertFalse(checkUserCode.isValidCodeOfEmployee());
    }
    @org.junit.jupiter.api.Test
    void isValidCodeOfEmployee_ValidCode_ReturnsTrue() {
        CheckUserCode userCode = new CheckUserCode("123");
        assertTrue(userCode.isValidCodeOfEmployee());
    }

    @org.junit.jupiter.api.Test
    void isValidCodeOfEmployee_InvalidCodeWithLetters_ReturnsFalse() {
        CheckUserCode userCode = new CheckUserCode("12A");
        assertFalse(userCode.isValidCodeOfEmployee());
    }

    @org.junit.jupiter.api.Test
    void isValidCodeOfEmployee_InvalidCodeWithSpecialChars_ReturnsFalse() {
        CheckUserCode userCode = new CheckUserCode("12@");
        assertFalse(userCode.isValidCodeOfEmployee());
    }

    @org.junit.jupiter.api.Test
    void isValidCodeOfEmployee_InvalidCodeWithLeadingZeros_ReturnsFalse() {
        CheckUserCode userCode = new CheckUserCode("000");
        assertFalse(userCode.isValidCodeOfEmployee());
    }

    @org.junit.jupiter.api.Test
    void isValidCodeOfEmployee_CodeTooShort_ReturnsFalse() {
        CheckUserCode userCode = new CheckUserCode("12");
        assertFalse(userCode.isValidCodeOfEmployee());
    }

    @org.junit.jupiter.api.Test
    void isValidCodeOfEmployee_CodeTooLong_ReturnsFalse() {
        CheckUserCode userCode = new CheckUserCode("1234");
        assertFalse(userCode.isValidCodeOfEmployee());
    }

}
