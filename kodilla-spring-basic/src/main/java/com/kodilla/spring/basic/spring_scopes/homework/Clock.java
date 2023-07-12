package com.kodilla.spring.basic.spring_scopes.homework;

import java.time.LocalTime;

public class Clock {
    private LocalTime actualTime;

    public Clock() {
        this.actualTime = LocalTime.now();
    }

    public LocalTime getActualTime() {
        return actualTime;
    }

    public void setCurrentTime(LocalTime currentTime) {
        this.actualTime = currentTime;
    }
}
