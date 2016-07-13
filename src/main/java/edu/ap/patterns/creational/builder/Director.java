package edu.ap.patterns.creational.builder;

public class Director {

    public Build build(Builder builder){
        builder.setComponentA();
        builder.setComponentB();
        builder.setComponentC();
        builder.setComponentD();
        return builder.build();
    }

}
