package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "person")
public class Person {
    @Id
    private int pid;
    private String pname;

    @Column(name = "aid")
    private int personAddress;

    public Person(){}

    public Person(int id, String name){
        this.pid = id;
        this.pname = name;
    }

//    @ManyToOne()
//    @JoinColumn(name = "aid")
//    private Address personAddress;

    public int getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(int personAddress) {
        this.personAddress = personAddress;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

//    public int getAid() {
//        return aid;
//    }
//
//    public void setAid(int aid) {
//        this.aid = aid;
//    }
}