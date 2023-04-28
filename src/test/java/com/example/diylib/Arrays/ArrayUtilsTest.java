package com.example.diylib.Arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    ArrayUtils arrayUtils = new ArrayUtils();


    @Test
    void TestStrToIntArr(){
        assertThat(arrayUtils.strToIntArr("1234")).isEqualTo(new int[]{1,2,3,4});
    }

}