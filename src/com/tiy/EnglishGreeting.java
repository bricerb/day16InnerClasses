package com.tiy;

/**
 * Created by Brice on 8/29/16.
 */
class EnglishGreeting implements HelloWorld {
    String name = "world";
    public void greet() {
        greetSomeone("world");
    }
    public void greetSomeone(String someone) {
        name = someone;
        System.out.println("Hello " + name);
    }
}
