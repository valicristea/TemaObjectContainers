package org.example;

import java.util.*;

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
        List<Address> a1 = new ArrayList<>();
        a1.add(new Address("Romania"));
        a1.add(new Address("Hungary"));
        List<Address> a2 = new ArrayList<>();
        a2.add(new Address("Denmark"));
        Hobby hobby1 = new Hobby("Cyclism", 1, a1);
        Hobby hobby2 = new Hobby ("Box", 3, a2);

        tree.add(person);
        tree.add(person2);
        tree.add(person3);

        HashMap<Person, List<Hobby>> map = new HashMap<>();
        map.put(person,List.of(hobby1, hobby2));
        map.put(person2, List.of(hobby2));
        map.put(person3, List.of(hobby1));
        for (Person p:tree){
            System.out.println("The name of the person is " + p.name + " and has "+p.age+" years!");
            System.out.println("The name of the hobbies are: ");
            for (Hobby h:map.get(p)){
                System.out.println (h.name);
                for (Address a:h.address){
                    System.out.println(a.country);
                }
            }
        }
    }
}
