package com.bhavna;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeLogIn implements Serializable {
    private int eId;
    private String name;
    private String time;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeLogIn that = (EmployeeLogIn) o;
        return eId == that.eId && Objects.equals(name, that.name) && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eId, name, time);
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public EmployeeLogIn( String name, String time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public String toString() {
        return "EmployeeLogIn{" +
                " name='" + name + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
