package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5, 7, 0};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {0, 1, 2, 3, 4, 5, 7};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort2() {
        int[] input = new int[] {6, 5, 9, 7, 2, 3, 4};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 3, 4, 5, 6, 7, 9};
        assertThat(result, is(expect));
    }
}