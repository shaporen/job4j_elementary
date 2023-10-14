package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20Than2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when35to37Than4dot47() {
        Point a = new Point(3, 3);
        Point b = new Point(5, 7);
        double expected = 4.47;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when15to89Than8dot06() {
        Point a = new Point(1, 5);
        Point b = new Point(8, 9);
        double expected = 8.06;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when510to69Than1dot41() {
        Point a = new Point(5, 10);
        Point b = new Point(6, 9);
        double expected = 1.41;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}