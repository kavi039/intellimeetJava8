package com.ttn.Java8Exercises.FinalExercise.enums;

public enum Organization {

    TTN("To The New",1),
    SAPIENT("Sapiennt",2),
    GOOGLE("Google",3);

    String name;
    Integer id;

    Organization(String name,Integer id){
        this.name=name;
        this.id=id;
    }
}