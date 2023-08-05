package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PrimeNumberTest {

    @Test
    void when5Than3() {
        int in = 5;
        int out = PrimeNumber.calc(in);
        int expected = 3;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void when11Than5() {
        int in = 11;
        int out = PrimeNumber.calc(in);
        int expected = 5;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void when2Than1() {
        int in = 2;
        int out = PrimeNumber.calc(in);
        int expected = 1;
        assertThat(out).isEqualTo(expected);
    }
}