package com.ttn.Java8Exercises.FinalExercise;

import com.ttn.Java8Exercises.FinalExercise.classes.Address;
import com.ttn.Java8Exercises.FinalExercise.classes.Person;
import com.ttn.Java8Exercises.FinalExercise.enums.Designation;
import com.ttn.Java8Exercises.FinalExercise.enums.Grade;
import com.ttn.Java8Exercises.FinalExercise.enums.Organization;
import com.ttn.Java8Exercises.FinalExercise.enums.State;
import com.ttn.Java8Exercises.StreamExercises.Employee;

import java.util.ArrayList;
import java.util.List;

public class Bootstrap {

    //First insert data 5 S/W,3 SE,4 Manager,2 QA.
    public static List<Person> insertPerson() {

        List<Person> personList = new ArrayList<>();
        //S/w list
        personList.add(new Person(109L, "kavita_Manager", new Address("abc", "B-345", State.UK), Organization.GOOGLE, Designation.MANAGER, Grade.A, 1000345.5F));
        personList.add(new Person(110L, "kavita_Manager", new Address("abc", "B-345", State.UK), Organization.GOOGLE, Designation.MANAGER, Grade.A, 1000.5F));

        personList.add(new Person(101L, "kavita_SW", new Address("abc", "B-345", State.UK), Organization.GOOGLE, Designation.SW, Grade.A, 1000.5F));
        personList.add(new Person(102L, "kavita_SE", new Address("abc", "B-345", State.UP), Organization.GOOGLE, Designation.SE, Grade.A, 1000.5F));
        personList.add(new Person(105L, "kavita_SE", new Address("abc", "B-345", State.UP), Organization.SAPIENT, Designation.SE, Grade.A, 10001.5F));

        personList.add(new Person(103L, "kavita_SW", new Address("abc", "B-345", State.UP), Organization.SAPIENT, Designation.SW, Grade.A, 10001.5F));
        personList.add(new Person(104L, "kavita_SW", new Address("abc", "B-345", State.UK), Organization.GOOGLE, Designation.SW, Grade.A, 1000.5F));

        //SE list
        personList.add(new Person(105L, "kavita_SE", new Address("abc", "B-345", State.UP), Organization.SAPIENT, Designation.SE, Grade.A, 10001.5F));
        personList.add(new Person(106L, "kavita_SE", new Address("abc", "B-345", State.UK), Organization.GOOGLE, Designation.SE, Grade.A, 1000.5F));

        //Manager
        personList.add(new Person(107L, "Sateesh", new Address("abc", "B-345", State.UK), Organization.GOOGLE, Designation.MANAGER, Grade.A, 1000.5F));
        personList.add(new Person(108L, "sakshi", new Address("abc", "B-345", State.UP), Organization.SAPIENT, Designation.MANAGER, Grade.A, 100012.5F));

        //QA
        personList.add(new Person(111L, "kavita_QA", new Address("abc", "B-345", State.UK), Organization.GOOGLE, Designation.QA, Grade.A, 1000.5F));
        personList.add(new Person(112L, "kavita_QA", new Address("abc", "B-345", State.UP), Organization.SAPIENT, Designation.QA, Grade.A, 10001.5F));
        return personList;
    }

    public static List<Employee> initEmployee(){
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("kavita",1000F));
        employees.add(new Employee("kavita",10090F));
        employees.add(new Employee("parul",100020F));
        employees.add(new Employee("parul",10020F));
        employees.add(new Employee("ajay",1009F));
        employees.add(new Employee("ajay",1008F));
        employees.add(new Employee("neha",1400F));
        employees.add(new Employee("prateesh",109000F));
        return employees;
    }

}
