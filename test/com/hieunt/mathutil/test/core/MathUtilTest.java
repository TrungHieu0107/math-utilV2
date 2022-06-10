/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieunt.mathutil.test.core;

//import org.junit.Test;

import com.hieunt.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

//import static org.junit.Assert.*;

/**
 *
 * @author ntrun
 */
public class MathUtilTest {
    //Đây là class sẽ sử dụng các hàm của thư viện/framework Junit 
    //Để kiểm thử/kiểm tra code chính - hàm tínhGiaiThua() bên 
    // class core.MathUtil 
    //viết code để test code bên kia 
    
    //có quy tắt đặt tên hàm kiểm thử nhưng thường sẽ là nói lên mục địch của kiểm thử của các case/ tình huống kiẻm thử
    //tình xuống xài app thành công hay thất bại
    
    //hàm chạy thành công trả về ngon
    //ta sẽ xài hàm kiểu well - đưa 5!, 6!, ko đưa -5!, 30!
    
    //@Test JUnit sẽ phối hợp với JVM để cahy5 hàm này 
    //@Test phía hậu trường là public static void main()
    //Có nhiều @Test ứng với nhiều case khác nhau về kiểm thử hàm tính giai thừa 
    @Test
    public void testGetFactorialGivenRightArgumentReturnWell(){
        int n = 0;  // test thử tình huống tử tế đầu vào
        long expected = 1;  //hy vọng rằng 0! = 1
//        long actual = ; //gọi hàm cần test bên core/app chính/ code chính
        long actual = MathUtil.getFactorial(n);
        
        //so sánh expected vs. actual dùng  xanh xanh đỏ đỏ, framework
        Assert.assertEquals(expected, actual);
        
        //Gộp thêm vài case thành công nữa/đưa đầu vào ngon!!! Hàm phải tính ngon 
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        
        //Hàm giúp so sánh 2 giá trị nào đó có giống nhau không
        //Nếu giống -> thảy màu xanh - code ngon 
        //              ít nhất cho case đang test
        //Nếu ko giống nhau -> nếu thảy màu đỏ 
        //                      hàm ý expected và actual ko giống nhau
    }
    
    //Hàm getFa() ta thiêt kế là có 2 tình huồng xử lí
    //1. Đưa data từ tế trong 0..20 -> tính dk n! - done
    //2. Đưa data vào cà chớn, âm, >20; THIẾT KẾ CỦA HÀM LÀ PHẢI NÉM RA NGOẠI LỆ 
    //TAO KÌ VỌNG NGOẠI LỆ XUẤT HIỆN TRONG TÌNH HUỐNG n > 20 || n < 0 
    //rất mong ngoại lệ xuất hiện với n cà chớn
    
    //Nếu hàm nhận vào n < 0 || n > 20 và hàm ném ra ngoại lệ 
    //  => Hàm chạy đúng như thiết kế -> XANH PHẢI XUẤT HIỆN
    
    // nếu hàm nhận vào n < 0 || n > 20 và hàm ko ném ra ngoại lệ 
    // => Sure HÀM CHẠY SAI THIẾT KẾ, SAI KÌ VỌNG, MÀU ĐỎ\
    
    //Test case:
    //input: -5
    //expected: IllegalArgumentException xuất hiện
    
    //tình huống bất thường, ngoại lệ, ngoài dự tính là những thứ ko thể đo lường để so sánh 
    //mà chỉ có thể đo lường bằng cách chúng có xuất hiện hay ko
    //assertEqual ko thể dùng để so sánh 2 ngoại lệ
    //      equal là bằng nhau hay không trên value
    
    //Màu đỏ do hàm có ném ngoại lệ nhưng nó ko phải là ngoại lệ như kì vọng chứ ko phải hàm ném sai
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowEception() {
//        MathUtil.getFactorial(-5);  //hàm @test chạy hay hàm getF() chạy
//                                    //sẽ ném về ngoại lệ NumberFormat...
//    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowEception() {
        MathUtil.getFactorial(-5);  //hàm @test chạy hay hàm getF() chạy
                                    //sẽ ném về ngoại lệ NumberFormat...
    }
    
    //Cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn 
    //Xài lambada 
    //Test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21
    //tui cần thấy màu xanh khi chơi với 21!
    
    @Test//(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowEception_LambdaVersion() {
//        Assert.assertThrows(tham số 1: loại ngoại lệ muốn so sánh 
//                            tham số 2: đoạn code chạy văng ra ngoại lệ runnable)
        
        MathUtil.getFactorial(-5);  //hàm @test chạy hay hàm getF() chạy
                                    //sẽ ném về ngoại lệ NumberFormat...
    }
    
    //Xem hàm có ném về ngoại lệ hay ko  khi n cà chờn
    //Có ném, tức là hàm chạy đúng thiết kế -> xanh 
    @Test
    public void testGetFactorialGivenWrongArgumentThrowException_TryCatch() {
        
        //Chủ động kiểm soát ngoại lệ
        try {
           MathUtil.getFactorial(-5); 
        } catch (Exception e) {
            //Bắt trycatch là JUnit sẽ ra màu xanh 
            //do đã chủ động bắt2 ngoại lệ 
            //nhưng ko chắc ngoại lệ mình cần có xuất hiện hay không 
            //có đoạn code kiiem63 soát đúng ngoại lệ IllegalArgumentExpections
            Assert.assertEquals("Invalid argument. N must be between 0..20", e.getMessage());
        }
          
    }
}
