package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SkipNegativeTest {

    @Test
    public void whenRowAndColumnIsEquals() {
        int[][] array = {
                {1, -1},
                {-1, 3}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {0, 3}
        };
        assertThat(result).isDeepEqualTo(expected);
    }

    @Test
    public void whenRow4AndColumnIsNotEquals() {
        int[][] array = {
                {1, -1},
                {-1, 3, -5},
                {0, 2, -3, -3}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {0, 3, 0},
                {0, 2, 0, 0}
        };
        assertThat(result).isDeepEqualTo(expected);
    }
}