package org.example.employees;

public class Accountant implements Idea{


    String post;

    public Accountant(String post) {
        this.post = post;
    }

    @Override
    public String post() {
        return post;
    }

}
