package com.ttn.Java8Exercises.StreamExercises;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Exercise9 {

    public static void main(String[] args) throws Exception{
        Files.list(Paths.get(".")).filter(Files::isDirectory).forEach(System.out::println);
    }

}
