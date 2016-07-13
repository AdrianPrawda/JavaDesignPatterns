package edu.ap.patterns.creational.factory;


public class Factory {

    public enum ProductTypes {
        PRODUCT_A, PRODUCT_B
    }

    public Product getProduct(ProductTypes type){
        switch(type) {
            case PRODUCT_A:
                return new ProductImplA();
            case PRODUCT_B:
                return new ProductImplB();
            default:
                return null;
        }
    }

}
