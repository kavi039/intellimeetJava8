package com.ttn.Java8Exercises.FinalExercise.enums;

public enum Designation {

    SE("Senior Engeneew"),
    MANAGER("Project Manage"),
    SW("Software Developer"),
    QA("Quality Assurance"),
    HR("HR");

    String name;

    Designation(String name){
        this.name=name;
    }


}
