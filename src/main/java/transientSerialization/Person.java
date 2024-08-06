package transientSerialization;

import java.io.Serializable;

public class Person implements Serializable {
    //Transient keyword is used to prevent serialization
    //it will return default value 0 when serialized/deserialized
    private transient int id;
    private String name;

    public Person (int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString (){
        return "Person[id =" + id + ", name=" + name + "]";
    }
}
