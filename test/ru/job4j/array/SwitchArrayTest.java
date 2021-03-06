package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, 3);
        assertThat(rsl, is(expect));
    }
    @Test
    public void whenSwap2to5() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expect = {1, 2, 6, 4, 5, 3};
        int[] rsl = SwitchArray.swap(input, 2, 5);
        assertThat(rsl, is(expect));
    }
    @Test
    public void whenSwap1to4() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expect = {1, 5, 3, 4, 2, 6};
        int[] rsl = SwitchArray.swap(input, 1, 4);
        assertThat(rsl, is(expect));
    }
}