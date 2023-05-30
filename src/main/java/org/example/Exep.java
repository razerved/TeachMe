package org.example;

import java.util.regex.Pattern;

public class Exep {

    private static String login;
    private static String password;
    private static String confirmPassword;

    public static void exept(String login, String password, String confirmPassword ) throws WrongLoginException, WrongPasswordException {
        String regex = "[0-9]+";

        if (login.length() > 20){
            throw new WrongLoginException();
        }else {
            Exep.login = login;
        }

        if (password.length() > 20){
            throw new ArithmeticException("WrongPasswordException");
        }else if (password.contains(" ") | !Pattern.compile(regex).matcher(password).find()){
            throw new WrongPasswordException();
        }else {
            Exep.password = password;
        }

        if (!confirmPassword.equals(password)){
            throw new WrongPasswordException();
        }else {
            Exep.confirmPassword = confirmPassword;
        }
    }



}
