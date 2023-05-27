package org.example.employees;

public class Worker implements Idea{


    String post;

    public Worker(String post) {
        this.post = post;
    }

    @Override
    public String post() {
        return post;
    }

}
