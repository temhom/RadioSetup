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
        radio.currentStation = 1;
        radio.turnForwardStation();

        int expected = 2;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnForwardStationToZeroIfMax() {
        RadioTuner radio = new RadioTuner();
        radio.currentStation = 9;
        radio.turnForwardStation();

        int expected = 0;
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

    @Test
    public void shouldTurnBackStationToNineIfMin() {
        RadioTuner radio = new RadioTuner();
        radio.currentStation = 0;
        radio.turnBackStation();

        int expected = 9;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    // TEST OF VOLUME // TEST OF VOLUME // TEST OF VOLUME //

    @Test
    public void shouldSetVolume() {
        RadioTuner radio = new RadioTuner();
        radio.currentVolume = 8;

        int expected = 8;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        RadioTuner radio = new RadioTuner();
        radio.setToMaxVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        RadioTuner radio = new RadioTuner();
        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        RadioTuner radio = new RadioTuner();
        radio.currentVolume = 7;
        radio.increaseVolume();

        int expected = 8;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseAndStayAtHighBorderIfMax() {
        RadioTuner radio = new RadioTuner();
        radio.currentVolume = 10;
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        RadioTuner radio = new RadioTuner();
        radio.currentVolume = 5;
        radio.reduceVolume();

        int expected = 4;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceAndStayAtLowBorderIfMin() {
        RadioTuner radio = new RadioTuner();
        radio.currentVolume = 0;
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}