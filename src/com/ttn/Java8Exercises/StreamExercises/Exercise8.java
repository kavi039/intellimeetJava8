package com.ttn.Java8Exercises.StreamExercises;

import com.ttn.Java8Exercises.FinalExercise.Bootstrap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {
        List<Employee> employees= Bootstrap.initEmployee();
        Map<String,Employee> map=employees.stream()
                .collect(Collectors.toMap(Employee::getName,employee -> employee,
                        (emp1, emp2) -> {
                    System.out.println("duplicate key found!");
                    return emp2;
                }));
        System.out.println(map);
    }
}
