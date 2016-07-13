package edu.ap.patterns.creational.builder;

public class BuilderImplB extends Builder {
    private String componentA;
    private String componentB;
    private String componentC;
    private String componentD;

    @Override
    public void setComponentA() {
        componentA = "Component A from Impl B!";
    }

    @Override
    public void setComponentB() {
        componentB = "Component B from Impl B!";
    }

    @Override
    public void setComponentC() {
        componentC = "Component C from Impl B!";
    }

    @Override
    public void setComponentD() {
        componentD = "Component D from Impl B!";
    }

    @Override
    public Build build() {
        return new Build(componentA, componentB, componentC, componentD);
    }
}
