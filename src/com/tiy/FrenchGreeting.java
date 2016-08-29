package com.tiy;

/**
 * Created by Brice on 8/29/16.
 */

class FrenchGreeting implements HelloWorld {

    String name = "tout le monde";
    public void greet() {
        greetSomeone("tout le monde");
    }
    public void greetSomeone(String someone) {
        name = someone;
        System.out.println("Salut " + name);
    }
}