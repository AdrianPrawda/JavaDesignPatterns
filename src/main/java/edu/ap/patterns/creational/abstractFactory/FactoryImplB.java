package edu.ap.patterns.creational.abstractFactory;


public class FactoryImplB implements Factory{
    @Override
    public Product createProduct() {
        ProductImplB productB = new ProductImplB();
        return productB;
    }
}
