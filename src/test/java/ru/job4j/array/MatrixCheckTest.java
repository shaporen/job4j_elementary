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

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHasNoMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isFalse();
    }
}