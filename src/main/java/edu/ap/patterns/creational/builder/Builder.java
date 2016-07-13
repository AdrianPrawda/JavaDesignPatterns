package edu.ap.patterns.creational.builder;

public abstract class Builder {
    public abstract void setComponentA();
    public abstract void setComponentB();
    public abstract void setComponentC();
    public abstract void setComponentD();

    public abstract Build build();
}
