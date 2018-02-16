package com.ttn.Java8Exercises.StreamExercises;

import com.ttn.Java8Exercises.FinalExercise.Bootstrap;

import java.util.List;

public class Exercise2 {

    public static void main(String[] args) {
        List<Employee> employees= Bootstrap.initEmployee();
        employees.stream().limit(5).forEach(System.out::println);
        employees.stream().skip(employees.size()-2).forEach(System.out::println);
    }
}
