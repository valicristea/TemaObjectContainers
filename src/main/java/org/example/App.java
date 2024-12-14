package org.example;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        TreeSet<Person> tree = new TreeSet<>(Comparator.comparing(Person::getName));
        Person person = new Person("Ion", 18);
        Person person2 = new Person ("Alex", 23);
        Person person3 = new Person ("Titi", 46);
        tree.add(person);
        tree.add(person2);
        tree.add(person3);
        for (Person p:tree){
            System.out.println("The name of the person is " + p.name + " and has "+p.age+" years!");

        }
    }
}
