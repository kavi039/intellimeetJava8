package com.ttn.Java8Exercises.StreamExercises;

import com.ttn.Java8Exercises.FinalExercise.Bootstrap;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {

        public static void main(String[] args) {
            List<Employee> employees= Bootstrap.initEmployee();
            Exercise6 exercise6=new Exercise6();
            boolean allMatch=employees.stream().allMatch(employee -> employee.getSalary()<3000);
            if(allMatch) {
                exercise6.getSortedList(employees);
            }

            boolean anyMatch=employees.stream().anyMatch(employee -> employee.getSalary()<3000);
            if(anyMatch) {
                exercise6.getSortedList(employees);
            }
        }

        List<Employee> getSortedList(List<Employee> employees){
            return employees.stream().sorted((p1, p2) -> {
                return p1.getName().compareTo(p2.getName());
            }).collect(Collectors.toList());
        }
}
