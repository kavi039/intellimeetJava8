package com.ttn.Java8Exercises.StreamExercises;

import com.ttn.Java8Exercises.FinalExercise.Bootstrap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise5 {

    public static void main(String[] args) {
        List<Employee> employees= Bootstrap.initEmployee();
       Map<String,Long> empMap= employees.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
       empMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(System.out::println);
       System.out.println(empMap);
    }
}
