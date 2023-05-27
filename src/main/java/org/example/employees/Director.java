package org.example.employees;

public class Director implements Idea{


    String post;

    public Director(String post) {
        this.post = post;
    }

    @Override
    public String post() {
        return post;
    }


}
