package org.example.model;

import org.example.stakeholders.User;

public class Exam {
    private String name;
    private User creator;


    public Exam(String name, User creator) {
        this.name = name;
        this.creator = creator;
    }

    public String getName() {
        return name;
    }

    public User getCreator() {
        return creator;
    }
}