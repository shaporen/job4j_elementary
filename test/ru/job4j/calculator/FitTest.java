package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import ru.job4j.converter.Converter;

public class FitTest {
    @SuppressWarnings("checkstyle:WhitespaceAfter")
    @Test
    public void testManWeight() {
        double in = 175;
        double expected = 86.25;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out,0.01);
    }
    @Test
    public void testWomanWeight() {
        double in = 155;
        double expected = 51.75;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out,0.01);
    }
}