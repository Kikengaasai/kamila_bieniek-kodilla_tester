package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String stampName;
    private int length;
    private int width;

    private boolean stamping;

    public Stamp(String stampName, int length, int width, boolean stamping) {
        this.stampName = stampName;
        this.length = length;
        this.width = width;
        this.stamping = stamping;
    }

    public String getStampName() {
        return stampName;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public boolean isStamping() {
        return stamping;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return length == stamp.length && width == stamp.width && stamping == stamp.stamping && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, length, width, stamping);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", stamping=" + stamping +
                '}';
    }
}
