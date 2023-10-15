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

    @Test
    void whenMax7to8to10Than10() {
        int first = 7;
        int second = 8;
        int third = 10;
        int out = Max.max(first, second, third);
        int expected = 10;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenMaxMinus7to8to5Than8() {
        int first = -7;
        int second = 8;
        int third = 5;
        int out = Max.max(first, second, third);
        int expected = 8;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenMaxMinus2to15to5to8Than15() {
        int first = -2;
        int second = 15;
        int third = 5;
        int forth = 8;
        int out = Max.max(first, second, third, forth);
        int expected = 15;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenMax17to15to5toMinus8Than17() {
        int first = 17;
        int second = 15;
        int third = 5;
        int forth = -8;
        int out = Max.max(first, second, third, forth);
        int expected = 17;
        assertThat(out).isEqualTo(expected);
    }
}