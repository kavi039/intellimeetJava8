package com.ttn.Java8Exercises.FinalExercise.classes;

import com.ttn.Java8Exercises.FinalExercise.enums.State;

public class Address {

    String street;
    String hNO;
    State state;

    public Address(String street, String hNO, State state) {
        this.street = street;
        this.hNO = hNO;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String gethNO() {
        return hNO;
    }

    public void sethNO(String hNO) {
        this.hNO = hNO;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
