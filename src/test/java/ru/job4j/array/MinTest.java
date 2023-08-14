package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MinTest {

    @Test
    public void whenTheFirstMin() {
        int[] array = {0, 5, 10};
        int result = Min.min(array);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenTheLastMin() {
        int[] array = {15, 11, 10};
        int result = Min.min(array);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenTheMiddleMin() {
        int[] array = {10, 5, 10};
        int result = Min.min(array);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}