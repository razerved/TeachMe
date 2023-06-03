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

    public static void someDoc5(){
        String docum = "1234-qwe-5678-asd-1a2w";
    }


}
