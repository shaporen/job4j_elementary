package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MatrixCheckTest {

    @Test
    public void whenHasMonoHorisontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorisontal(input, row);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHasNoMonoHorisontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', ' '},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorisontal(input, row);
        assertThat(result).isFalse();
    }
}