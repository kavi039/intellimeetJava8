package com.ttn.Java8Exercises.FinalExercise.enums;

public enum State {
    UP("Uttarpradesh",201301),
    UK("Uttrakhand",263637);

    String name;
    Integer pincode;

    State(String name,Integer pincode){
        this.name=name;
        this.pincode=pincode;
    }
}
