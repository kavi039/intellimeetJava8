package com.ttn.Java8Exercises.StreamExercises;

import com.ttn.Java8Exercises.FinalExercise.Bootstrap;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<Employee> employees= Bootstrap.initEmployee();
        //Without using stream ................
        List<Employee> filteredList=new ArrayList<>();
        for(Employee employee:employees){
            if(employee.getSalary()>10000)
                filteredList.add(employee);
        }
        for (Employee employee:filteredList)
            System.out.println(employee.getName());

        //with stream

        employees.stream().filter(employee -> employee.getSalary()>10000).forEach(System.out::println);

    }
}


