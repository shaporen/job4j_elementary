package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CheckPrimeNumberTest {

    @Test
    void when5() {
        int in = 5;
        boolean out = CheckPrimeNumber.check(in);
        assertThat(out).isTrue();
    }

    @Test
    void when4() {
        int in = 4;
        boolean out = CheckPrimeNumber.check(in);
        assertThat(out).isFalse();
    }

    @Test
    void when1() {
        int in = 1;
        boolean out = CheckPrimeNumber.check(in);
        assertThat(out).isFalse();
    }
}