package edu.ap.patterns.creational.factoryMethod;

public class ProductImpl implements Product{

    public ProductImpl(){
    }

    @Override
    public void doSomething(String something) {
        System.out.println(something);
    }
}
