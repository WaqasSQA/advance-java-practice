package generics;

import java.util.ArrayList;
import java.util.HashMap;


class Animal {

}
public class Generics {

    public static void main(String[] args) {
        ////// Using ArrayList wihtout type and that's why we are casting
        // it into string because get returns an object
        ArrayList list = new ArrayList();
        list.add("Cat");
        list.add("Dog");

        String animal = (String) list.get(0);
        System.out.println(animal);


        ///////Using generic class with Type
        //// we declared type in the generic class so we don't need casting
        ArrayList<String> string = new ArrayList<String>();
        string.add("Sky");
        string.add("Stars");

        String universe = string.get(1);
        System.out.println(universe);


        /////HashMap class
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "donlad");
        map.put(2, "trump");

        System.out.println(map.get(1));


        ////Using generic class
        ArrayList<Animal> animals = new ArrayList<>();

    }
}
