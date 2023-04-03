package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTunerTest {
    @Test
    public void shouldSetStation() {
        RadioTuner radio = new RadioTuner();
        radio.currentStation = 5;

        int expected = 5;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxStation() {
        RadioTuner radio = new RadioTuner();
        radio.setToMaxStation();

        int expected = 9;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinStation() {
        RadioTuner radio = new RadioTuner();
        radio.setToMinStation();

        int expected = 0;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnForwardStation() {
        RadioTuner radio = new RadioTuner();
        radio.currentStation = 3;
        radio.turnForwardStation();

        int expected = 4;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnBackStation() {
        RadioTuner radio = new RadioTuner();
        radio.currentStation = 9;
        radio.turnBackStation();

        int expected = 8;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }
}