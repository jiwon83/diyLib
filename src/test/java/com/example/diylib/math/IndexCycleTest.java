package com.example.diylib.math;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class IndexCycleTest {
    IndexCycle IndexCycle = new IndexCycle();

    @Test
    void testGetIndexCycle(){

        assertThat(IndexCycle.getIndexCycle(1, 4, 6)).isEqualTo(2);
        assertThat(IndexCycle.getIndexCycle(1, 4, 3)).isEqualTo(3);
        assertThat(IndexCycle.getIndexCycle(1, 4, -2)).isEqualTo(2);


        assertThat(IndexCycle.getIndexCycle(-5, -2, 0)).isEqualTo(-4);
        assertThat(IndexCycle.getIndexCycle(-5, -2, -4)).isEqualTo(-4);
        assertThat(IndexCycle.getIndexCycle(-5, -2, -7)).isEqualTo(-3);


        assertThat(IndexCycle.getIndexCycle(0, 5, 7)).isEqualTo(1);
        assertThat(IndexCycle.getIndexCycle(0, 5, 2)).isEqualTo(2);
        assertThat(IndexCycle.getIndexCycle(0, 5, -3)).isEqualTo(3);

    }

}