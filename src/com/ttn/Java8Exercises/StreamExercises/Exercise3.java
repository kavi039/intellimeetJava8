package com.ttn.Java8Exercises.StreamExercises;

import com.ttn.Java8Exercises.FinalExercise.Bootstrap;

import java.util.List;
import java.util.Optional;

public class Exercise3 {

    public static void main(String[] args) {
        List<Employee> employees= Bootstrap.initEmployee();
        Optional<Employee> employee=employees.stream().max((e1, e2)->e1.getSalary()>=e2.getSalary()?0:-1);
        System.out.println(employee.get().getName());
    }
}
