package edu.ap.patterns.creational.prototype;

public class PrototypeImplB extends AbstractPrototype{

    public PrototypeImplB(){
        type = "PrototypeImplB";
    }

    @Override
    public void hello() {
        System.out.println("Inside PrototypeImplB::hello() method - Type: " + type);
    }
}
