package com.bhavna.bean;


public class EmployeeLogIn {
    private String name;
    private String time;


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

    public EmployeeLogIn(String name, String time) {
        super();
        this.name = name;
        this.time = time;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
