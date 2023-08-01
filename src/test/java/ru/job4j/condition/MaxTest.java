package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Than2() {
        int left = 1;
        int right = 2;
        int out = Max.max(left, right);
        int expected = 2;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenMax5To2Than2() {
        int left = 5;
        int right = 2;
        int out = Max.max(left, right);
        int expected = 5;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenMax3To3Than3() {
        int left = 3;
        int right = 3;
        int out = Max.max(left, right);
        int expected = 3;
        assertThat(out).isEqualTo(expected);
    }
}