package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void testDistance() {
        double expected = 4.12;
        double out = Point.distance(1, 1, 2, 5);
        Assert.assertEquals(expected, out, 0.01); }
}