package edu.ap.patterns.creational.prototype;


public abstract class AbstractPrototype implements Cloneable {

    private String id;
    protected String type;

    public abstract void hello();

    public void setId(String id){
        this.id = id;
    }

    public String getID(){
        return id;
    }

    public String getType(){
        return type;
    }

    @Override
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
