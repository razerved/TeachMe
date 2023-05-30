package org.example;

public class WrongPasswordException extends Exception {

    public WrongPasswordException() {
        super("Password length should be less than 20 characters, should not include spaces and have at least one digit");
    }

    public WrongPasswordException(String message) {
        super(message);
    }


}
