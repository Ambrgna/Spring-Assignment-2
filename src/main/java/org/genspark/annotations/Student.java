package org.genspark.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Student {
    private int id;
    private String name;
    private List<Phone> ph;
    @Autowired
    private Address add;

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public Student(int id, String name, List<Phone> ph) {
        this.id = id;
        this.name = name;
        this.ph = ph;
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
