package org.example;

public class RadioTuner {

    private int currentStation;
    private int currentVolume;

    private int maximalStation;

    public RadioTuner() {
        maximalStation = 9;
    }

    public RadioTuner(int StationsQuantity) {

        maximalStation = StationsQuantity - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maximalStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void turnForwardStationNext() {
        if (currentStation < maximalStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void turnBackStationPrev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maximalStation;
        }
    }

    public void setToMaxStation() {
        currentStation = maximalStation;
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
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
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
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }
}

//Вроде так!