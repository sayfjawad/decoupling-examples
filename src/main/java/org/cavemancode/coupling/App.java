package org.cavemancode.coupling;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        final Monkey monkey = new Monkey();
        final Banana banana = new Banana();

        monkey.eat(banana);
    }
}
