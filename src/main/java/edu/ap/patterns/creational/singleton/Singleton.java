package edu.ap.patterns.creational.singleton;

/**
 * This pattern is responsible to create an object while making sure that only one gets created. This class also
 * provides ways to access its object without the need to instantiate it.
 *
 * Further reading: http://www.javaworld.com/article/2073352/core-java/simply-singleton.html
 */

public final class Singleton {

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

    private Singleton(){
    }

}
