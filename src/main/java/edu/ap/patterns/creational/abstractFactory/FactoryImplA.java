package edu.ap.patterns.creational.abstractFactory;


public class FactoryImplA implements Factory{
    @Override
    public Product createProduct() {
        ProductImplA productA = new ProductImplA();
        return productA;
    }
}
