/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieunt.mathutil.core;

/**
 *
 * @author ntrun
 */
public class MathUtil {
    
    //trong class này cung cấp cho ta rất nhiều hàm xứ lí toán học
    //clone class Math của JDK
    //hàm thư viện xài chung cho ai đó mà ko cần lưu lại gtri thì chọn thiết kế là static
    
    //Hàm tính giai thừa!!!
    //n! = 1.2.3.4.5.....n
    // ko có giai thừa cho số âm 
    //0! = 1! = 1 quy ước
    //Giai thừa tăng rất nhanh, đồ thị dốc đứng, tăng nhanh về giá trị 
    //20! là 18 con số 0, Vừa kịp đủ cho kiểu long của java 
    //21! tràn kiểu long 
    // Bài này quy ước tính n! trong khoảng 0..20
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        
        if (n == 0 || n == 1) 
            return 1; //kết thúc cuộc chơi sớm nếu nhận những đầu vào đặc biệt
        
        long product = 1;//Tích nhân dồn, thuật toán heo đất, ốc bưu dồn thịt
        for (int i = 2; i <= n; i++) 
//            product = product * i;
            product *= i;
        return product;
        
    }
    
}
