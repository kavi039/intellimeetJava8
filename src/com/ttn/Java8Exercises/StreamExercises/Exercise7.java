package com.ttn.Java8Exercises.StreamExercises;

import com.ttn.Java8Exercises.FinalExercise.Bootstrap;

import java.util.List;

public class Exercise7 {

    public static void main(String[] args) {
        List<Employee> employees= Bootstrap.initEmployee();
        employees.forEach(System.out::println);
        System.out.println("....................");
        //for distict we need to override
        employees.stream().distinct().forEach(System.out::println);
    }
}
