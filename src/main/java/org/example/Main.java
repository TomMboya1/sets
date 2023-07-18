package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {



    Set<String> daysOfWeekHashSet = new HashSet<>();
        daysOfWeekHashSet.add("Monday");
        daysOfWeekHashSet.add("Tuesday");
        daysOfWeekHashSet.add("Wednesday");
        daysOfWeekHashSet.add("Thursday");
        daysOfWeekHashSet.add("Friday");
        daysOfWeekHashSet.add("Saturday");
        daysOfWeekHashSet.add("Sunday");


        System.out.println("HashSet content: " + daysOfWeekHashSet);


    Set<String> daysOfWeekLinkedHashSet = new LinkedHashSet<>();
        daysOfWeekLinkedHashSet.add("Monday");
        daysOfWeekLinkedHashSet.add("Tuesday");
        daysOfWeekLinkedHashSet.add("Wednesday");
        daysOfWeekLinkedHashSet.add("Thursday");
        daysOfWeekLinkedHashSet.add("Friday");
        daysOfWeekLinkedHashSet.add("Saturday");
        daysOfWeekLinkedHashSet.add("Sunday");

        System.out.println("LinkedHashSet content: " + daysOfWeekLinkedHashSet);


    boolean isEqual = daysOfWeekHashSet.equals(daysOfWeekLinkedHashSet);
        System.out.println("Are the sets equal? " + isEqual);
    }
}