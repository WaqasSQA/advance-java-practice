package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetApp {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>(); // Random order
        Set<String> set2 = new LinkedHashSet<>(); // exact order when put elements
        Set<String> set3 = new TreeSet<>(); // for natural ordering

        //Check if set is empty
        /*if(set3.isEmpty()){
            System.out.println("set empty");
        }*/

        set3.add("Cat");
        set3.add("Dog");
        set3.add("Horse");
        set3.add("Snake");

        ///Iteration
       //for(String val : set3){
          // System.out.println(val);
       //}

       ////Intersection////
        Set<String> set4 = new HashSet<>();
        set4.add("Cat");
        set4.add("Dog");
        set4.add("Bear");
        set4.add("Elephant");

        Set<String> intersection = new HashSet<>(set3);
        intersection.retainAll(set4);
        System.out.println(intersection);

        //// Difference //////
        Set<String> difference = new HashSet<>(set4);
        difference.removeAll(set3);

        System.out.println(difference);

    }
}
