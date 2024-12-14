package org.example;

public class Person {
    public String name;
    Integer age;

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person){
            return this.name == ((Person) obj).name && this.age == ((Person) obj).age;
        }
        return false;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
