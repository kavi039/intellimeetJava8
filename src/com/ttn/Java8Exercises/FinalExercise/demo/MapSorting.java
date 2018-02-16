package com.ttn.Java8Exercises.FinalExercise.demo;

import com.ttn.Java8Exercises.StreamExercises.Employee;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapSorting {

    public static void main(String[] args) {
        Map<String, Employee> map = new HashMap<>();
        map.put("g", new Employee("kavita", 51F));
        map.put("a", new Employee("stayendra", 25F));
        map.put("e", new Employee("neha", 500F));

        //Comparing by key
        Map<String, Employee> sortedNewMap = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        sortedNewMap.forEach((key, val) -> {
            System.out.println(key + " = " + val.toString());
        });

        //Comparing by value custom logic
        sortedNewMap = map.entrySet().stream().sorted((e1, e2) ->
                e1.getValue().getSalary().compareTo(e2.getValue().getSalary()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        sortedNewMap.forEach((key, val) -> {
            System.out.println(key + " = " + val.toString());
        });
    }
}
