package com.kodilla.spotbugs;

import java.util.Objects;

public class BadCodeExample {
    private String type;
    public static final double PI = 3.14159265359;

    public static double getPi() {
        return PI;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BadCodeExample that = (BadCodeExample) o;

        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return type != null ? type.hashCode() : 0;
    }
}