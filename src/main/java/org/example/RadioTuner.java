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

          if (currentStation == 9) {
                currentStation = 0;
            }
        }
    }

    public void turnBackStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
            if (currentStation == 0) {
                currentStation = 9;
            }
        }
    }
}