package iterators;

import java.util.Iterator;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cow");

        // Old approach to iterate over each element
        //We can remove an element while iterating
        Iterator<String> it = animals.iterator();

        while (it.hasNext()){
            String value = it.next();
            System.out.println(value);

            if (value.equals("Cow")){
                it.remove();
            }
        }


        System.out.println("=============================");

        //Modern Implementation after Java 5
        //But in forEach we cannot remove an element during iteration
        for(String ani : animals){
            System.out.println(ani);
        }
    }
}
