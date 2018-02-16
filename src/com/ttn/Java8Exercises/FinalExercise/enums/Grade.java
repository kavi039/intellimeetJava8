package com.ttn.Java8Exercises.FinalExercise.enums;

public enum Grade {

    A("A","Execellent"),
    B("B","Good"),
    C("C","Average");

    String name,value;

    Grade(String name,String value){
        this.name=name;
        this.value=value;
    }
}
