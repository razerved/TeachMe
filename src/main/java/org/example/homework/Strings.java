package org.example.homework;

public class Strings {


    public static void trySplit(String docum){
        String[] s = docum.split("-");
        System.out.println(s[0] + " " + s[2]);
    }
    public static void tryReplace(String docum){
        String[] s = docum.split("-");
        s[1] = "***";
        s[3] = "***";
        for (String a : s){
            System.out.print(a);
        }
        System.out.println();
    }

    public static void tryToTrim(String docum){
        String[] s = docum.split("-");
        String[] a = s[4].split("[0-9]");
        System.out.println(s[1] + "/" + s[3] + "/" + a[1] + "/" + a[2]);
    }

    public static void tryToTrimStringBilder(String docum){
        String[] s = docum.split("-");
        String[] a = s[4].split("[0-9]");
        String stringBilder = s[1].toUpperCase() + "/" +
                s[3].toUpperCase() + "/" +
                a[1].toUpperCase() + "/" +
                a[2].toUpperCase() + "/";
        System.out.println("String Buf: " + stringBilder);
    }

    public static void tryFindABC(String number){
        if (number.contains("abc")|| number.contains( "ABC" )){
            System.out.print("The number of the document contains 'abc' or 'ABC'");
        }else {
            System.out.println("The number of the document doesn't contain 'abc' or 'ABC'.");
        }
    }

    public static void tryFindFive(String number){
        if (number.startsWith("555")){System.out.print("The number of the document starts with '555'");
        }
        else {System.out.print("The number of the document doesn't start with '555'");
        }
    }

    public static void tryFindOneATwoB(String number) {
        if (number.endsWith("1a2b")){System.out.print("The number of the document ended with '1a2b'");
        }
        else {System.out.print("The number of the document doesn't end with '1a2b'");
        }


    }




}
