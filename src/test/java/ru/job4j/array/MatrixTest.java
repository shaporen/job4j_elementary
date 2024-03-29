package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MatrixTest {

    @Test
    public void when2to2() {
        int size = 2;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        assertThat(result).isDeepEqualTo(expected);
    }

    @Test
    public void when7to7() {
        int size = 7;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1, 2, 3, 4, 5, 6, 7},
                {2, 4, 6, 8, 10, 12, 14},
                {3, 6, 9, 12, 15, 18, 21},
                {4, 8, 12, 16, 20, 24, 28},
                {5, 10, 15, 20, 25, 30, 35},
                {6, 12, 18, 24, 30, 36, 42},
                {7, 14, 21, 28, 35, 42, 49}
        };
        assertThat(result).isDeepEqualTo(expected);
    }
}