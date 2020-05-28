package ru.job4j.loop;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int qaz = Factorial.calc(5);
        int qaz2 = 120;
        assertThat(qaz, is(qaz2));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int qaz = Factorial.calc(0);
        int qaz2 = 1;
        assertThat(qaz, is(qaz2));
    }
}