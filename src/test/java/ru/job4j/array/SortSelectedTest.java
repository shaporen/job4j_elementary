package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = {5, 3, 8, 6, 1, 2, 4, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        assertThat(result).containsExactly(expected);
    }
}