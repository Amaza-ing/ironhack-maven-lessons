package com.ironhack.w2d3;

public class User {
    private long id;
    private String name;
    private Status status;

    public User(String name) {
        this.name = name;
        this.status = Status.ONLINE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
