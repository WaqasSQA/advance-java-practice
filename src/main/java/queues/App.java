package queues;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {
    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayBlockingQueue<>(3);

        q1.add(10);
        q1.add(23);
        q1.add(45);

        // It will throw exception because the size of queue is 3 and we are adding 4 elements in it
        try{
            q1.add(50);
        }
        catch (IllegalStateException e){
            System.out.println("Exceeded the Queue Size");
        }

        System.out.println("Head of the Queue " + q1.element());

        for (Integer val: q1){
            System.out.println("Values : "+val);
        }

        //q1.remove();
        Integer val;
        val = q1.remove();
        System.out.println("removed value : " + val);
    }
}
