/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieunt.mathutil.test.core;

import com.hieunt.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author ntrun
 */
//Câu lệnh này là của JUnit báo hiệu rằng sẽ cần loop qua tập data 
//lấy cặp data input/expectedd nhồi vào hàm test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    //ta sẽ trả về mảng 2 chiều gồm nhiều cắp Expected/Input
    @Parameterized.Parameters   //JUnit sẽ ngầm chạy loop qua từng dòng để lấy ra tứng cặp data input/expected 
    //tên hàm ko qtrong, qtrong là @

    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {6, 720},
        };

        //Giả sử loop qua được từng dòng của mảng, ta vẩn cần gán từng value của cột 
        //Vào biến tương ứng input, expected  để feed cho hàm
    }

    @Parameterized.Parameter(value = 0) // map với mảng data
    public int n; // biến map với value của cột 0 của mảng
    @Parameterized.Parameter(value = 1)
    public long expected; //kiểu long vì giá trị của hàm getF() là long

    @Test
    public void testGetFactorialGivenRightArgumentReturnWell(){
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}
