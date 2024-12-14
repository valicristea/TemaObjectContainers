package org.example;

import java.util.List;

public class Hobby {
    String name;
    Integer frequency;
    List <Address> address;

    public Hobby(String name, Integer frequency, List<Address> address) {
        this.name = name;
        this.frequency = frequency;
        this.address = address;
    }
}
