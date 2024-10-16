package com.giaolang.mathutil.core.test;

import com.giaolang.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    //Test case structure: ID, Description, Steps/Procedures
    //                     Expected Result, Status (Passed, Failed)
    //                     Bug ID (Bugzilla, Jira)

    //Test Case #4: check getFactorial() with n = -1 -2 -3 -4 -5 21 22 23 24
    @Test
    public void testFactorialGivenWrongArgumentsThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-1);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-2);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-100);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(21);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(22);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(50);});
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(100);});

    }
    @Test
    public void testFactorialGivenWrongArgumentMinus5ThrowsException() {
        //MathUtility.getFactorial(-5); CHƯA BẮT XEM CÓ NGOẠI LỆ NHƯ KÌ VỌNG HAY KO

        assertThrows(IllegalArgumentException.class,
                () -> {
                        MathUtility.getFactorial(-5);
                });
    } //THẤY NGOẠI LỆ MỪNG RƠI NƯỚC MẮT
    //VÌ HÀM THẾT KẾ RẰNG ĐƯA N < 0 HOẶC N > 20 THÌ NGOẠI LỆ PHẢI ĐC NÉM RA
    //VẬY NẾU HÀM NÉM NGOẠI LỆ KHI N = -5 RÕ RÀNG HÀM ĐÚNG, HÀM ĐÚNG THÌ PHẢI XANH
    //XANH VÌ TRẢ VỀ NGOẠI LỆ ĐÚNG NHƯ KÌ VỌNG

    //Test Case #3 (gộp): check getFactorial() with n = 2 3 4 5 6...
    @Test
    public void testFactorialGivenRightArgumentsReturnsWell() {
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(720, MathUtility.getFactorial(6));
    }   //bad smells = đoạn code bốc mùi (Robert C. Martin - Clean Code)
        //code bị lặp lại, trộn lộn xộn test data và lệnh kiểm thử
    //ta cần tinh chỉnh, tối ưu code - REFACTOR, REFACTORING

    //Test Case #2: check getFactorial() with n = 1
    @Test
    public void testFactorialGivenRightArgument1ReturnsWell() {
        assertEquals(1, MathUtility.getFactorial(1));
    }

    //Test case #1: check getFactorial() with n = 0
    //...

    @Test
    public void testFactorialGivenRightArgument0ReturnsWell() {
        long expectedValue = 1; //hy vọng 0! trả về 1
        long actualValue = MathUtility.getFactorial(0);  //giả bộ hàm trả về 10

        //SO SÁNH 2 THẰNG EXPECTED VS. ACTUAL
        assertEquals(expectedValue, actualValue);
    }

}