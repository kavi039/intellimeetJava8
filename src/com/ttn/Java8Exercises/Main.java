package com.ttn.Java8Exercises;

import com.ttn.Java8Exercises.FinalExercise.classes.Bootstrap;
import com.ttn.Java8Exercises.FinalExercise.classes.Person;
import com.ttn.Java8Exercises.FinalExercise.enums.Designation;
import com.ttn.Java8Exercises.FinalExercise.enums.Organization;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> personList= Bootstrap.insertPerson();

        //update list for left manager
        personList=personList.stream().filter(person -> {
            String name=person.getName();
            if(name.startsWith("s") || name.endsWith("sh")) {
//                Print the manage who has left
                System.out.println(person);
                return false;
            }
            return true;
        }).collect(Collectors.toList());

//        Updated person list printing
        personList.forEach(System.out::println);

//        Print the count of Manager
        Long managerCount=personList.stream().filter(Person.isManager()).count();
        System.out.println("Manager count : "+managerCount);

//Show person List in assending order of Name,designation,organization.
        //comparing passinf argument Taking class type
       personList= personList.stream().sorted(Comparator.comparing((Person person)->person.getOrganization())
                .thenComparing(Person::getName)
                .thenComparing(Person::getDesignation)
        ).collect(Collectors.toList());
       personList.forEach(System.out::println);

//        Update the designation of 'SE' where id is '102' to 'TL' who is from UP.
        Person person=personList.stream().filter(person1 ->person1.getId()==102 ).collect(Collectors.toList()).get(0);
        person.setDesignation(Designation.MANAGER);
        System.out.println(personList.stream().filter(person1 -> person1.getId()==102).findFirst().get());

//         Print the name of person and designation having max salary  : it will not handle if more than one person havng max salary
        person=  personList
                .stream()
                .max((person1,person2)->person1.getSalary()>=person2.getSalary()?0:-1).get();
        System.out.println("Person having max salary is    :  "+person +"  salary is : "+person.getSalary());

//    Print the name of each person having max salary grouping by designation.
//    Map<Organization,Long> organizationListMap=personList.stream().collect(Collectors.groupingBy(person1-> person1.getOrganization(),Collectors.counting()));
    Map<Organization,List<Person>> organizationListMap=personList.stream().collect(Collectors.groupingBy(person1-> person1.getOrganization(),Collectors.toList()));
        printMe(".......................... organization mapping ",organizationListMap,".............");
    }

    static private void printMe(Object ...objects){
        Arrays.stream(objects).forEach(System.out::println);
    }

}
