package edu.ap.patterns.creational.abstractFactory;


public class ProductImplA implements Product{
    @Override
    public void doSomething(String something) {
        System.out.println("Greetings from Product A: " + something);
    }

    @Override
    public void doSomethingElse(String somethingElse) {
        System.out.println("Greetings from Product A: " + somethingElse);
    }
}
