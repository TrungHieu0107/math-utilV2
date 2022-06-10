/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieunt.mathutil.main;

import com.hieunt.mathutil.core.MathUtil;

/**
 *
 * @author ntrun
 */
public class Main {
    public static void main(String[] args) {
        //thử nghiệm hàm tính giai thừa coi chạy đúng nhưthiet61 kế hay ko 
        //ta phải đưa các tình huống sử dụng hàm trong thực tế
        // vì dụ đưa vào -5
        //      0 coi được mấy 
        //      20 
        //      21
        //Test Case: 1 tình huống cần hàm/app/màn hình/tính năng được đưa vào sử dụng
        //Giả lập hành vi của ai đó 
        
        //Test Case là 1 tình huống sử dụng app, xài app(hàm) mà nó bao hàm 
        //INPUT: DATA ĐẦU VÀO CỤ THỂ NÀO ĐÓ
        // data đàu vào cụ thể nào đó
        //OUTPUT ĐẦU RA ỨNG VỚI XỬ LÍ HÀM.CHỨC NĂNG CỦA APP, DĨ NHIÊN DÙNG ĐẦU VÀO ĐỂ XỬ LÍ
        //KÌ VỌNG: MONG HÀM SẼ TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INPUT Ở TRÊN 
        //SO SÁNH ĐỂ XE KẾT QUẢ CÓ NHƯ KÌ VỌNG HAY KHÔNG
        long expected = 120; // kì vọng hàm trả về 120 nếu tính 5!
        int n = 5;          // input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = 120 (expected);" );
        System.out.println("5! = " + actual + " (actual)");
    }
    
}
