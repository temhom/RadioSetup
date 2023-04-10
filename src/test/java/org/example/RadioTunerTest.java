package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTunerTest {

    @Test
    public void shouldSetStation() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNearLow() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNearHigh() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {
        RadioTuner radio = new RadioTuner();
        radio.setToMaxStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStation() {
        RadioTuner radio = new RadioTuner();
        radio.setToMinStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetUnderMinStation() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveMaxStation() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnForwardStationNext() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentStation(5);
        radio.turnForwardStationNext();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnForwardStationNextNearHigh() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentStation(8);
        radio.turnForwardStationNext();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnForwardStationNextNearLow() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentStation(0);
        radio.turnForwardStationNext();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnForwardStationNextFromMax() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentStation(9);
        radio.turnForwardStationNext();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnBackStationPrev() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentStation(5);
        radio.turnBackStationPrev();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnBackStationPrevNearHigh() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentStation(9);
        radio.turnBackStationPrev();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnBackStationPrevNearLow() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentStation(1);
        radio.turnBackStationPrev();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnBackStationFromMin() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentStation(0);
        radio.turnBackStationPrev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // TEST OF VOLUME // TEST OF VOLUME // TEST OF VOLUME //

    @Test
    public void shouldSetVolume() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeNearHigh() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentVolume(9);

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeNearLow() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        RadioTuner radio = new RadioTuner();
        radio.setToMaxVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        RadioTuner radio = new RadioTuner();
        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetUnderMinVolume() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveMaxVolume() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentVolume(5);
        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeNearHigh() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentVolume(9);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeNearLow() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseAndStayAtHighBorderIfMax() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentVolume(5);
        radio.reduceVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeNearHigh() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentVolume(10);
        radio.reduceVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeNearLow() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentVolume(1);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceAndStayAtLowBorderIfMin() {
        RadioTuner radio = new RadioTuner();
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}