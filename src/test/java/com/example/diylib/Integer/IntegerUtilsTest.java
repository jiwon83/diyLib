package com.example.diylib.Integer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class IntegerUtilsTest {
    IntegerUtils integerUtils = new IntegerUtils();

    @Test
    @DisplayName("reverse int")
    void testReverseInt(){
        //when
        int when = 123;
        //then
        assertThat(integerUtils.reverseInt(when)).isEqualTo(321);

    }

}