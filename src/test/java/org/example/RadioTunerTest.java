package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTunerTest {
    RadioTuner radio = new RadioTuner();

    RadioTuner radioFree = new RadioTuner(200);

    @Test
    public void shouldSetStation() {

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationFree() {

        radioFree.setCurrentStation(150);

        int expected = 150;
        int actual = radioFree.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNearLow() {

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNearLowFree() {

        radioFree.setCurrentStation(1);

        int expected = 1;
        int actual = radioFree.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNearHigh() {

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNearHighFree() {

        radioFree.setCurrentStation(198);

        int expected = 198;
        int actual = radioFree.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {

        radio.setToMaxStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStationFree() {

        radioFree.setToMaxStation();

        int expected = 199;
        int actual = radioFree.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStation() {

        radio.setToMinStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStationFree() {

        radioFree.setToMinStation();

        int expected = 0;
        int actual = radioFree.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetUnderMinStation() {

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetUnderMinStationFree() {

        radioFree.setCurrentStation(-1);

        int expected = 0;
        int actual = radioFree.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveMaxStation() {

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveMaxStationFree() {

        radioFree.setCurrentStation(222);

        int expected = 0;
        int actual = radioFree.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnForwardStationNext() {

        radio.setCurrentStation(5);
        radio.turnForwardStationNext();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnForwardStationNextFree() {

        radioFree.setCurrentStation(55);
        radioFree.turnForwardStationNext();

        int expected = 56;
        int actual = radioFree.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnForwardStationNextNearHigh() {

        radio.setCurrentStation(8);
        radio.turnForwardStationNext();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnForwardStationNextNearHighFree() {

        radioFree.setCurrentStation(198);
        radioFree.turnForwardStationNext();

        int expected = 199;
        int actual = radioFree.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnForwardStationNextNearLow() {

        radio.setCurrentStation(0);
        radio.turnForwardStationNext();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnForwardStationNextNearLowFree() {

        radioFree.setCurrentStation(0);
        radioFree.turnForwardStationNext();

        int expected = 1;
        int actual = radioFree.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnForwardStationNextFromMax() {

        radio.setCurrentStation(9);
        radio.turnForwardStationNext();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnForwardStationNextFromMaxFree() {

        radioFree.setCurrentStation(199);
        radioFree.turnForwardStationNext();

        int expected = 0;
        int actual = radioFree.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnBackStationPrev() {

        radio.setCurrentStation(5);
        radio.turnBackStationPrev();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnBackStationPrevFree() {

        radioFree.setCurrentStation(99);
        radioFree.turnBackStationPrev();

        int expected = 98;
        int actual = radioFree.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnBackStationPrevNearHigh() {

        radio.setCurrentStation(9);
        radio.turnBackStationPrev();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnBackStationPrevNearHighFree() {

        radioFree.setCurrentStation(198);
        radioFree.turnBackStationPrev();

        int expected = 197;
        int actual = radioFree.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnBackStationPrevNearLow() {

        radio.setCurrentStation(1);
        radio.turnBackStationPrev();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnBackStationPrevNearLowFree() {

        radioFree.setCurrentStation(1);
        radioFree.turnBackStationPrev();

        int expected = 0;
        int actual = radioFree.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnBackStationFromMin() {

        radio.setCurrentStation(0);
        radio.turnBackStationPrev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnBackStationFromMinFree() {

        radioFree.setCurrentStation(0);
        radioFree.turnBackStationPrev();

        int expected = 199;
        int actual = radioFree.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // TEST OF VOLUME // TEST OF VOLUME // TEST OF VOLUME //

    @Test
    public void shouldSetVolume() {

        radio.setCurrentVolume(55);

        int expected = 55;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeNearHigh() {

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeNearLow() {

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {

        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {

        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetUnderMinVolume() {

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveMaxVolume() {

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {

        radio.setCurrentVolume(80);
        radio.increaseVolume();

        int expected = 81;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeNearHigh() {

        radio.setCurrentVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeNearLow() {

        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseAndStayAtHighBorderIfMax() {

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {

        radio.setCurrentVolume(55);
        radio.reduceVolume();

        int expected = 54;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeNearHigh() {

        radio.setCurrentVolume(100);
        radio.reduceVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeNearLow() {

        radio.setCurrentVolume(1);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceAndStayAtLowBorderIfMin() {

        radio.setCurrentVolume(0);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

// New Test For RadioTuner Quantity
// После отпуска. Логика вроде готова (на заданное число станций (10) и произвольное (стаавлю сам, например, 200).
// Надо проверить эту логику через два блока уже готовых, текущих тестов (возможно хватит только их, или допилить)
// Если при: 10 станциях + произвольных станциях (устанавливаю в тестах в круглых скобках) + макс.звуке 100 всё прошло (по бранч-покрытию тоже)
// Готово!
// Делаю пуш этой ветки Flexible в гит. Потом делаю пул реквест и делюсь им в ДЗ!

