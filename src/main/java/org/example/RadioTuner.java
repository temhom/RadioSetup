package org.example;

public class RadioTuner {

    public int currentStation;

    public void setToMaxStation() {
        currentStation = 9;
    }

    public void setToMinStation() {
        currentStation = 0;
    }

    public void turnForwardStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void turnBackStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    // VOLUME // VOLUME// VOLUME// VOLUME// VOLUME// VOLUME// VOLUME// VOLUME

    public int currentVolume;

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public void setToMinVolume() {
        currentVolume = 0;
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
}