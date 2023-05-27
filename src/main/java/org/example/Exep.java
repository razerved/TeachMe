package org.example;

import java.util.regex.Pattern;

public class Exep {

    private static String login;
    private static String password;
    private static String confirmPassword;

    public static void exept(String login, String password, String confirmPassword ){
        String regex = "[0-9]+";

        for (int i = 0; i < login.length(); i++) {
            if (i > 20) {
                throw new ArithmeticException("WrongLoginException");
            }else {
                Exep.login = login;
            }
        }

        for (int i = 0; i < password.length(); i++){
            if (i > 19){
                throw new ArithmeticException("WrongPasswordException");
            }else if (password.contains(" ") | !Pattern.compile(regex).matcher(password).find()){
                throw new ArithmeticException("WrongPasswordException");
            }else {
                Exep.password = password;
            }
        }

        if (!confirmPassword.equals(password)){
            throw new ArithmeticException("WrongConfPasswordException");
        }else {
            Exep.confirmPassword = confirmPassword;
        }


    }



}
