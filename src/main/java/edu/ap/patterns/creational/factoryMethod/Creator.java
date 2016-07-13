package edu.ap.patterns.creational.factoryMethod;

public abstract class Creator {

    public abstract Product factoryMethod();

    public Product getProduct(){
        Product product = factoryMethod();
        return product;
    }
}
