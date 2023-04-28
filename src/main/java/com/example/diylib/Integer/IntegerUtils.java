package com.example.diylib.Integer;

public class IntegerUtils {

    public int reverseInt(int num){
        int left=num;
        int save=0;
        while (left > 0){
            save = save*10 + left % 10;
            left = left/10;

        }
        return save;
    }
}
