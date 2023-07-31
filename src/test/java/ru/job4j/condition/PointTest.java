package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20Than2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when35to37Than4dot47() {
        int x1 = 3;
        int y1 = 3;
        int x2 = 5;
        int y2 = 7;
        double expected = 4.47;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when15to89Than8dot06() {
        int x1 = 1;
        int y1 = 5;
        int x2 = 8;
        int y2 = 9;
        double expected = 8.06;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when510to69Than1dot41() {
        int x1 = 5;
        int y1 = 10;
        int x2 = 6;
        int y2 = 9;
        double expected = 1.41;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}