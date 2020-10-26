package ru.job4j.pojo;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class LicenseTest {

    @Test
    public void eqCode() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first, is(second));
    }

    @Test
    public void eqOwner() {
        License first = new License();
        first.setOwner("Sergey");
        License second = new License();
        second.setOwner("Sergey");
        assertThat(first, is(second));
    }
}