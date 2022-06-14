package com.company;

import java.util.concurrent.CyclicBarrier;

public class City implements Comparable<City> {

    private String name;
    private int code;

    public City(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public int compareTo(City code) {
        if (this.code == code.getCode()) {
            return 0;
        } else if (this.code > code.getCode()) {
            return -1;
        } else
            return 1;
    }

    public String toString() {
        return "City name: " + this.getName() + ", code: " +  this.getCode();
    }
}
