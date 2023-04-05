package org.genspark.xml;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Student {
    private int id;
    private String name;
    @Autowired
    private List<Phone> ph;
    @Autowired
    private Address add;

    public Student(int id, String name, List<Phone> ph, Address add) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID:" + id +
                ", Name:'" + name + '\'' +
                ", Phone" + ph +
                ", Address" + add +
                '}';
    }
}
