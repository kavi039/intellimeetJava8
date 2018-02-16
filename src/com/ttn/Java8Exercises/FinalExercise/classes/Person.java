package com.ttn.Java8Exercises.FinalExercise.classes;

import com.ttn.Java8Exercises.FinalExercise.enums.Designation;
import com.ttn.Java8Exercises.FinalExercise.enums.Grade;
import com.ttn.Java8Exercises.FinalExercise.enums.Organization;

import java.util.function.Predicate;

public class Person {
    private Long id;
    private String name;
    private Address address;
    private Organization organization;
    private Designation designation;
    private Grade grade;
    private Float salary;

    public Person(Long id, String name, Address address, Organization organization, Designation designation, Grade grade, Float salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.organization = organization;
        this.designation = designation;
        this.grade = grade;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public static Predicate<Person> isManager(){
        return p->Designation.MANAGER.equals(p.designation);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", organization=" + organization +
                ", designation=" + designation +
                '}';
    }
}
