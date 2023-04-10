package org.example;

public class RadioTuner {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void turnForwardStationNext() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void turnBackStationPrev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    public void setToMaxStation() {
        currentStation = 9;
    }

    public void setToMinStation() {
        currentStation = 0;
    }


    // VOLUME // VOLUME// VOLUME// VOLUME// VOLUME// VOLUME// VOLUME// VOLUME

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }

    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }
}