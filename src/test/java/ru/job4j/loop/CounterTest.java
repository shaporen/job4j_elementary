package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenSumByEvenNumbersFromOneToTenThanThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenNumbersFromThreeToElevenThanEighteen() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumByEvenNumbersFromTenToFifteenThanThirtySix() {
        int start = 10;
        int finish = 15;
        int result = Counter.sumByEven(start, finish);
        int expected = 36;
        assertThat(result).isEqualTo(expected);
    }
}