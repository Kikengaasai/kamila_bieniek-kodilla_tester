package com.kodilla.collections.adv.maps.complex.homework;

import java.util.Objects;

public class Principal {
   private String schoolName;
    private String principalName;
    private String principalLastName;

    public Principal(String schoolName, String principalName, String principalLastName) {
        this.schoolName = schoolName;
        this.principalName = principalName;
        this.principalLastName = principalLastName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public String getPrincipalLastName() {
        return principalLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(schoolName, principal.schoolName) && Objects.equals(principalName, principal.principalName) && Objects.equals(principalLastName, principal.principalLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, principalName, principalLastName);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "schoolName='" + schoolName + '\'' +
                ", principalName='" + principalName + '\'' +
                ", principalLastName='" + principalLastName + '\'' +
                '}';
    }
}
