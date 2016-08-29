package com.tiy;

/**
 * Created by Brice on 8/29/16.
 */

public class SpanishGreeting implements HelloWorld{

    String name = "mundo";
    public void greet() {
        greetSomeone("mundo");
    }
    public void greetSomeone(String someone) {
        name = someone;
        System.out.println("Hola, " + name);
    }
}