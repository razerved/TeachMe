package org.example.archil;

// Interface public
public interface GeneralInterface {
    // Classical Interface
    void sayHello();
    void sayGoodbye();

    // new version
    // default - дать базовое тело
    // и не принуждает меня везде его переопределять
    default void basicRealization()
    {
        System.out.println("This is a default method with Basic Realization...");
    }

    // private methods -> only for interface
    private void closeMethod()
    {
        // private data
    }

    // introduced variables
    int num = 10;
    double doubleNum = 20;
}