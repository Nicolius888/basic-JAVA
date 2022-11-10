package com.exercises;

public class Auto {

    String name = "";

    public Auto(){};

    public Auto(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                '}';
    }
}
