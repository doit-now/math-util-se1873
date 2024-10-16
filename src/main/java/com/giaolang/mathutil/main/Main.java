package com.giaolang.mathutil.main;

import com.giaolang.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArgument0ReturnsWell();
        //System.out.println("0!: " + MathUtility.getFactorial(0) );  //lầy lội
        testFactorialGivenRightArgument5ReturnsWell();
    }

    //TEST CASE #2

    //DESCRIPTION: TO CHECK, TO VERIFY THE getFactorial() method with correct
    //                                          given argument, e.g n = 5
    //             vietsub: kiểm tra hàm giai thừa có đúng với n = 5 hay ko?

    //STEPS/PROCEDURES:
    //  CALL getFactorial() method with valid arg: getFactorial(5)

    //EXPECTED RESULT
    //        To have number 120 as the result of 5!
    static void testFactorialGivenRightArgument5ReturnsWell() {
        System.out.println("5! = \n"
                + "expected value: 120\n"
                + "actual value: " + MathUtility.getFactorial(5));
    }


    //STATUS (TRẠNG THÁI CỦA TEST CASE LÀ GÌ SAU KHI CHẠY APP CHẠY HÀM)
    //       PASSED, FAILED (BUG)
    //       CHỜ XEM HÀM, APP XỬ LÝ ĐC SỐ MẤY - ACTUAL VALUE
    //       VÀ ĐI SO SÁNH VỚI EXPECTED Ở TRÊN ĐỂ LUẬN ĐÚNG SAI!!!!

    //   MLEM VÌ 0! TRẢ VỀ 1 THẬT MÀ!



    //TA SẼ TEST HÀM CỦA TA VIẾT RA, GỌI LÀ UNIT TESTING - TEST NHỮNG ĐƠN VỊ
    //CODE CƠ BẢN NHẤT
    //TA CẦN TEST HÀM GETFACTORIAL() VỚI CÁC BỘ DATA ĐƯA VÀO -> NHỮNG TEST CASE
    //TEST CASE LÀ GÌ?: LÀ NHỮNG BỘ DATA ĐƯA VÀO HÀM, APP, VÀ CÁCH THỨC XÀI
    //                  BỘ DATA NÀY, VÀ KÈM THEO KẾT QUẢ KÌ VỌNG APP/HÀM SẼ TRẢ VỀ GÌ ĐÓ

    //TEST CASE #1

    //DESCRIPTION: (MÔ TẢ MỤC ĐÍCH TEST CASE, TEST CASE DÙNG TEST ĐIỀU GÌ?)
    //             TO CHECK, TO VERIFY THE getFactorial() method with correct
    //                                          given argument, e.g n = 0
    //             vietsub: kiểm tra hàm giai thừa có đúng với n = 0 hay ko?

    //STEPS/PROCEDURES: (CÁC BƯỚC TEST HÀM/APP, NHẤN GÌ, NHẬP GÌ...)
    //  CALL getFactorial() method with valid arg: getFactorial(0)

    //EXPECTED RESULT (TA HY VỌNG HÀM TRẢ VỀ GÌ VỚI N = 0)
    //        To have number 1 as the result of 0!
    //        vietsub: hy vọng hàm trả về 1 với 0!

    //STATUS (TRẠNG THÁI CỦA TEST CASE LÀ GÌ SAU KHI CHẠY APP CHẠY HÀM)
    //       PASSED, FAILED (BUG)
    //       CHỜ XEM HÀM, APP XỬ LÝ ĐC SỐ MẤY - ACTUAL VALUE
    //       VÀ ĐI SO SÁNH VỚI EXPECTED Ở TRÊN ĐỂ LUẬN ĐÚNG SAI!!!!

    //   MLEM VÌ 0! TRẢ VỀ 1 THẬT MÀ!

    //VIẾT CODE TEST ĐỂ TEST HÀM CHÍNH GETFACTORIAL() CHẠY ĐÚNG VỚI N = 0 HAY KO

    static void testFactorialGivenRightArgument0ReturnsWell() {
        int n = 0;  //dụ tính tính 0!
        long expectedResult = 1;  //0! hy vọng là 1
        long actualResult = MathUtility.getFactorial(0); //tính thử 0! bằng hàm

        //so sánh:
        System.out.println(n + "! = \n"
                           + "expected value: " + expectedResult + "\n"
                           + "actual value: " + actualResult);

    }
}