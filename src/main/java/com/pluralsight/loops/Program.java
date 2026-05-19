package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        people.add(new Person("John", "Doe", 21));
        people.add(new Person("Jimmy", "John", 23));
        people.add(new Person("Bobby", "Lee", 19));
        people.add(new Person("Christian", "Nieves", 18));
        people.add(new Person("Mark", "Williams", 20));
        people.add(new Person("Daniel", "Martinez", 67));
        people.add(new Person("Emily", "Davis", 24));
        people.add(new Person("Ryan", "Wilson", 41));
        people.add(new Person("Ashley", "Taylor", 29));

        System.out.println("Search by Name: ");
        String userInput = scanner.nextLine();

        List<Person> foundNames = new ArrayList<>();

        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(userInput) || person.getLastName().equalsIgnoreCase(userInput))
                foundNames.add(person);
        }

        for (Person foundName : foundNames) {
            System.out.println(foundName);
        }

        System.out.println("Average age: " + String.format("%.1f", calculateAverage(people)));
        System.out.println("Oldest: " + getOldest(people));
        System.out.println("Youngest: " + getYoungest(people));


    }

    private static double calculateAverage(List<Person> people) {
        double totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }
        return totalAge / people.size();
    }

    private static int getOldest(List<Person> people) {
        int oldestAge = people.get(0).getAge();
        for (Person person : people) {
            if (person.getAge() > oldestAge) {
                oldestAge = person.getAge();
            }
        }
        return oldestAge;
    }

    private static int getYoungest(List<Person> people) {
        int youngestAge = people.get(0).getAge();
        for (Person person : people) {
            if (person.getAge() < youngestAge) {
                youngestAge = person.getAge();
            }
        }
        return youngestAge;
    }

}
