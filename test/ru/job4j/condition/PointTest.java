package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void testDistance() {
        double expected = 2.00;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void testDistance1() {
        double expected = 7.07;
        Point a = new Point(0, 0);
        Point b = new Point(1, 7);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void testDistance2() {
        double expected = 8.12;
        Point a = new Point(2, 2, 2);
        Point b = new Point(3, 6, 9);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}