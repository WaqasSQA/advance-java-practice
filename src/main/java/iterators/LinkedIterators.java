package iterators;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedIterators {

    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cow");

        ListIterator<String> it = animals.listIterator();

        while (it.hasNext()){
            String val = it.next();
            System.out.println(val);
        }

        //ListIterator allows us to add element during iteration
        it.add("Snake");

        System.out.println("=====================================");

        for(String ani : animals){
            System.out.println(ani);
        }

    }
}
