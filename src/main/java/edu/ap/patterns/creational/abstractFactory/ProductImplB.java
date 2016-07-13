package edu.ap.patterns.creational.abstractFactory;


public class ProductImplB implements Product{
    @Override
    public void doSomething(String something) {
        System.out.println("Greetings from Product B: " + something);
    }

    @Override
    public void doSomethingElse(String somethingElse) {
        System.out.println("Greetings from Product B: " + somethingElse);
    }
}
