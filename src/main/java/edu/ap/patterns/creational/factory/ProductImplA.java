package edu.ap.patterns.creational.factory;


public class ProductImplA implements Product{

    public ProductImplA(){
    }

    @Override
    public void doSomething(String something) {
        System.out.println("Implementation A says: " + something);
    }
}
