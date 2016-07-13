package edu.ap.patterns.creational.builder;

public class Build {

    private String componentA;
    private String componentB;
    private String componentC;
    private String componentD;

    public Build(String c1, String c2, String c3, String c4){
        componentA = c1;
        componentB = c2;
        componentC = c3;
        componentD = c4;
    }

    public void printComponents(){
        System.out.println("Components: " + componentA + componentB + componentC + componentD);
    }
}
