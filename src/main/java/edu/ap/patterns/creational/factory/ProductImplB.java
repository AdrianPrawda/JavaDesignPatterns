package edu.ap.patterns.creational.factory;


public class ProductImplB implements Product{

    public ProductImplB(){
    }

    @Override
    public void doSomething(String something) {
        System.out.println("Implementation B says: " + something);
    }
}
