package linkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AppLinkedList {

    public static void main(String[] args) {

        //We should use arrayList when we want to add something at the end of the list because
        //[1][2][3][4] ==> because it shifts elements to the right side when adding at the
        // first so that's why it takes a lot of time at the end its easy because it has less items
        ArrayList<Integer> arrayList = new ArrayList<>();

        //We should use linkedList when we want to add an element at the start or any anywhere near start
        //[1]=>[2]=>[3] and it also has the refernce back to an element so its easy to traverse from the start
        //   <=   <=
        LinkedList<Integer> linkedList = new LinkedList<>();

        addingEndtoList("ArrayList", arrayList);
        addingEndtoList("LinkedList", linkedList);
        System.out.println("==============================================");
        addStartToList("ArrayList", arrayList);
        addStartToList("LinkedList", linkedList);

    }

    private static void addingEndtoList (String type, List<Integer> list){

        System.out.println("Adding elements at the end of the list....");
            for(int i=0; i<1E5; i++){
                list.add(i);
            }

            long start = System.currentTimeMillis();
             for(int i=0; i<1E5; i++){
                list.add(i);
        }
             long end = System.currentTimeMillis();
        System.out.println("Total time taken " + (end-start) + "ms for " + type);
    }
    private static void addStartToList(String type, List<Integer> list){
        System.out.println("Adding elements at the start of the list....");
        for(int i=0; i<1E5; i++){
            list.add(0, i);
        }

        long start1 = System.currentTimeMillis();
        for(int i=0; i<1E5; i++){
            list.add(0, i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Total time taken " + (end1-start1) + "ms for " + type);
    }
}
