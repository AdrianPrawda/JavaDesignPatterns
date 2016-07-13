package edu.ap.patterns.creational.prototype;

import java.util.Hashtable;

public class PrototypeCache {

    private static Hashtable<String, AbstractPrototype> prototypeMap = new Hashtable<>();

    public static AbstractPrototype getPrototype(String type){
        AbstractPrototype cachedPrototype = prototypeMap.get(type);
        return cachedPrototype;
    }

    public static void loadCache(){
        PrototypeImplA prototypeA = new PrototypeImplA();
        prototypeMap.put(prototypeA.getType(), prototypeA);

        PrototypeImplB prototypeB = new PrototypeImplB();
        prototypeMap.put(prototypeB.getType(), prototypeB);
    }

}
