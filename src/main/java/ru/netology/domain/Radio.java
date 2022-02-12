package ru.netology.domain;

public class Radio {
    private int currentStationNumber;
    private int currentSoundVolume;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentStationNumber(int currentStationNumber ) {
        if (currentStationNumber > 9) {
            return;
        }
        if (currentStationNumber <= 0) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public void setNextRadioStation() {
        if (currentStationNumber < 9) {
            currentStationNumber++;
        } else {
            currentStationNumber = 0;
        }
    }

    public void setPrevRadioStation() {
        if (currentStationNumber > 0) {
            currentStationNumber--;
        } else {
            currentStationNumber = 9;
        }
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > 10) {
            return;
        }
        if (currentSoundVolume <= 0) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void setCurrentSoundVolumeUp() {
        if (currentSoundVolume < 10) {
            currentSoundVolume++;
        } else {
            currentSoundVolume = 10;
        }
    }

    public void setCurrentSoundVolumeDown() {
        if (currentSoundVolume > 0) {
            currentSoundVolume--;
        } else {
            currentSoundVolume = 0;
        }
    }
}
