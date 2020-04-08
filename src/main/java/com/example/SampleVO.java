package com.example;

import java.time.LocalDateTime;

public class SampleVO {
    LocalDateTime time;

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "SampleVO{" +
                "time=" + time +
                '}';
    }
}
