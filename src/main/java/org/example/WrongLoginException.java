package org.example;

public class WrongLoginException extends Exception{

    public WrongLoginException(){
        super("Login length should be less than 20 characters and should not include spaces");
    }

    public WrongLoginException(String message) {
        super(message);
    }

}
