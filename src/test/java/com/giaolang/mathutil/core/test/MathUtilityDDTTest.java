package com.giaolang.mathutil.core.test;

import com.giaolang.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    //CLASS NÀY SẼ CHỨA CÁC HÀM KIỂM THỬ CODE THEO STYLE DDT
    //DATA DRIVEN TESTING, TA TÁCH CODE KIỂM THỬ (CÁC LỆNH ASSERT()) RIÊNG
    //KO GỘP CHUNG VỚI BỘ DATA KIỂM THỬ
    //MỤC TIÊU: DỄ ĐỌC CODE KIỂM THỬ, DỄ ĐÁNH GIÁ ĐC XEM CÓ BAO NHIÊU TEST
    //CASE ĐANG ĐC TEST, ĐÃ ĐỦ HAY CHƯA, VÌ NÓ RẤT DỄ THẤY DO DATA NẰM RIÊNG
    //-> GIÚP NGUYÊN LÝ PESTICIDE PARADOX

    //BỘ DATA ĐƯA VÀO TEST SẼ ĐỂ RIÊNG Ở 1 HÀM PUBLIC STATIC
    //hàm này trả về 1 mảng các con số < 0 hoặc > 20, đó là những n gây ra
    //exception khi ta xài hàm getF(). Ta test xem hàm có ném ngoại lệ với
    //data cà chớn hay ko
    public static Integer[] initWrongDataSet() {
        return new Integer[] {-1, -2, -3, -4, -100, -1000, 21, 22, 23, 100, 1000};
    }

    //Test case #... : check if getFactorial() throws IllegalArgumentException
    //                   in case of n < 0 or n > 20
    @ParameterizedTest
    @MethodSource("initWrongDataSet")
    public void testFactorialGivenWrongArgumentsThrowsException(int n) {
        assertThrows(IllegalArgumentException.class, ()->{MathUtility.getFactorial(n);});
    }

    //Test case #... : check getFactorial() with right arguments and runs well
    //                                       n = 0 1 2 3 4... 18 19 20
    public static Object[][] initRightDataSet() {
        return new Object[][] {{0, 1},
                               {1, 1},
                               {2, 2},
                               {3, 6},
                               {4, 24},
                               {5, 120},
                               {5, 120},
                               {6, 720}
                              };
    }

    @ParameterizedTest
    @MethodSource("initRightDataSet")
    public void testFactorialGivenRightArgumentsRunWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }

}