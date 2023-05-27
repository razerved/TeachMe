package org.example;

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

        for (int x = 0; x < password.length(); x++){
            if (x > 19){
                throw new ArithmeticException("WrongPasswordException");
            }else if (password.contains(" ") | !password.matches(regex)){
                throw new ArithmeticException("WrongPasswordException");
            }else {
                Exep.password = password;
            }
        }


        for (int i = 0; i < confirmPassword.length(); i++){
            if (i > 19){
                throw new ArithmeticException("WrongPasswordException");
            }else if (confirmPassword.contains(" ") | !confirmPassword.matches(regex) | !confirmPassword.equals(password)){
                throw new ArithmeticException("WrongPasswordException");
            }else {
                Exep.confirmPassword = confirmPassword;
            }
        }

    }



}
