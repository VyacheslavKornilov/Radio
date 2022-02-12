package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void enterStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        radio.setNextRadioStation();
        int expected = 2;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(2);
        radio.setPrevRadioStation();
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStationIfMaxSet() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.setNextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void prevStationIfNumberStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.setPrevRadioStation();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeLevel() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(5);
        int expected = 5;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeLevelUp() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(5);
        radio.setCurrentSoundVolumeUp();
        int expected = 6;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeLevelDown() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(6);
        radio.setCurrentSoundVolumeDown();
        int expected = 5;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeLevelUpIfVolumeLevelMax() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(10);
        radio.setCurrentSoundVolumeUp();
        int expected = 10;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeLevelDownIfVolumeLevelMin() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.setCurrentSoundVolumeDown();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void enterNotCorrectStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(10);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        assertEquals(expected, actual);
    }
}