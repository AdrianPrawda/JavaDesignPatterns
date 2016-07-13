package edu.ap.patterns.structural.proxy;

public class RealSubject implements Subject {

    public RealSubject(){
        loadFromDisk();
    }

    @Override
    public void proxyMethod(){
        System.out.println("Object loaded from disk.");
    }

    private void loadFromDisk(){
        System.out.println("Loading from disk...");
    }
}
