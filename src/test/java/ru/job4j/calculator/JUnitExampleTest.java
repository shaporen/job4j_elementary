package ru.job4j.calculator;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.*;

class JUnitExampleTest {

    @Test
    void when5and5Than25() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(5, 5);
        assertThat(result).isEqualTo(25);
    }

    @RepeatedTest(2)
    void when5and5Than252() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(5, 5);
        assertThat(result).isEqualTo(25);
    }

    @Test
    @DisplayName("When 5 multi 5 should be 25")
    void when5and5Than253() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(5, 5);
        assertThat(result).isEqualTo(25);
    }

    @Disabled
    @Test
    void when5and5Than254() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(5, 5);
        assertThat(result).isEqualTo(25);
    }

    @Timeout(3)
    @Test
    void when5and5Than255() throws InterruptedException {
        Thread.sleep(2000);
        JUnitExample example = new JUnitExample();
        int result = example.multiply(5, 5);
        assertThat(result).isEqualTo(25);
    }

    @Timeout(value = 3100, unit = TimeUnit.MILLISECONDS)
    @Test
    void when5and5Than256() throws InterruptedException {
        Thread.sleep(3000);
        JUnitExample example = new JUnitExample();
        int result = example.multiply(5, 5);
        assertThat(result).isEqualTo(25);
    }
}