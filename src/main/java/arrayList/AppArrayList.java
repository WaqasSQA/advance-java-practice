package arrayList;

import java.util.ArrayList;
import java.util.List;

public class AppArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);

        for (Integer integer : num) {
            System.out.println(integer);
        }

        // List interface
        //List is an abstract interface that's why it cannot be instantiated
        List<String> values = new ArrayList<String>();
    }
}
