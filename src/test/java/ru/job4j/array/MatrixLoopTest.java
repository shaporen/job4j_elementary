package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MatrixLoopTest {

    @Test
    public void whenSingle() {
        int[][] array = {
                {10}
        };
        int result = MatrixLoop.sum(array);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenTwo() {
        int[][] array = {
                {10, 5},
                {1, 3}
        };
        int result = MatrixLoop.sum(array);
        int expected = 19;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenThree() {
        int[][] array = {
                {10, 6, 2, 4},
                {5, 4, 7},
                {2, 1}
        };
        int result = MatrixLoop.sum(array);
        int expected = 41;
        assertThat(result).isEqualTo(expected);
    }
}