package ru.netology.radio;

public class Radio {
    public int currentRadioStation;
    public int minRadioStation = 0;
    public int maxRadioStation = 9;
    public int currentVolume;
    public int minVolume = 0;
    public int maxVolume = 10;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation >= maxRadioStation) {
            currentRadioStation = minRadioStation;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void previousRadioStation() {
        if (currentRadioStation <= minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}


