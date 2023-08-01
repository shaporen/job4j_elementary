package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DummyBotTest {

    @Test
    void whenGreetBot() {
        String in = "Hi, Bot";
        String out = DummyBot.answer(in);
        String expected = "Hi, Smart Ass";
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenByeBot() {
        String in = "Bye";
        String out = DummyBot.answer(in);
        String expected = "See you later";
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenUnknownBot() {
        String in = "Can you add two plus two?";
        String out = DummyBot.answer(in);
        String expected = "I don't know. Please, ask another question.";
        assertThat(out).isEqualTo(expected);
    }
}