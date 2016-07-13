package edu.ap.patterns.creational.factoryMethod;

public class CreatorImpl extends Creator {
    @Override
    public Product factoryMethod() {
        Product product = new ProductImpl();
        return product;
    }
}
