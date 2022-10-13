package org.sotibob;

import java.util.List;

@org.springframework.stereotype.Component
public class Student {
    @org.springframework.beans.factory.annotation.Value("#{01}")
    private int id;
    @org.springframework.beans.factory.annotation.Value("#{new java.lang.String('Sotonte Bob-manuel')}")
    private String name;
    @org.springframework.beans.factory.annotation.Autowired
    private List<Phone> ph;
    @org.springframework.beans.factory.annotation.Autowired
    private Address address;

//    public Student(int id, String name, java.util.List<Phone> ph, org.sotibob.Address address) {
//        this.id = id;
//        this.name = name;
//        this.ph = ph;
//        this.address = address;
//    }

//    public Student(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<Phone> getPh() {
        return ph;
    }

    public void setPh(java.util.List<Phone> ph) {
        this.ph = ph;
    }

    public org.sotibob.Address getAddress() {
        return address;
    }

    public void setAddress(org.sotibob.Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + getPh() +
                    ", address=" + address +
                    '}';
    }
}