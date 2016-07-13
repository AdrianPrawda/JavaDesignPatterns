package edu.ap.patterns.creational.prototype;

public class PrototypeImplA extends AbstractPrototype{

    public PrototypeImplA(){
        type = "PrototypeImplA";
    }

    @Override
    public void hello() {
        System.out.println("Inside PrototypeImplA::hello() method - Type: " + type);
    }
}
