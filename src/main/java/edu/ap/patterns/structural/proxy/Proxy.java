package edu.ap.patterns.structural.proxy;

/**
 * Creates an object that contains another object which functionality should be interfaces to the outer world
 *
 * Usefull in following scenarios:
 * - object represented is external to the system
 * - objects need to be created on demand
 * - access control is required
 * - added functionality is required when accessing an object
 *
 * Examples:
 * - Accessing of large files can be delayed until the content is really needed
 * - When communication with a third party is expensive, the proxy can hold data until you are ready to send
 * - Decouple implementation code from the access to a library
 */

public class Proxy implements Subject{

    private RealSubject realSubject;

    public Proxy(){

    }

    public void proxyMethod(){
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.proxyMethod();
    }
}
