package com.example.diylib.Arrays;

import java.util.Arrays;

public class ArrayUtils {

    /** 숫자로 구성된 문자열 배열을 int형 배열로 변환 */
    public int[] strToIntArr(String str){
        int [] result = new int[str.length()];
        for (int i=0; i< str.length(); i++){
            result[i] = str.charAt(i) - '0';
        }
        return result;
    }
}
