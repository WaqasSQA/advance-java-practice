package generics.wildcards;

import java.util.ArrayList;

public class WildCard {
    public static void main(String[] args) {
        ArrayList<Machine> list1 = new ArrayList<>();
        list1.add(new Machine());
        list1.add(new Machine());

        ArrayList<Camera> list2 = new ArrayList<>();
        list2.add(new Camera());
        list2.add(new Camera());
        //show(list1);
        show2(list2);
    }

    //// The ? is used for wildcard entry meaning any type of Oject can be passed
    ///// We use Object in loop because Object is parent of the all the classes in Java
    public static void show(ArrayList<? extends Machine> list) {
        for (Machine value : list) {
            System.out.println(value);
            value.start();
        }
    }

    public static void show2(ArrayList<? super Camera> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }

    static class Machine {
        public String toString() {
            return "I am Machine";
        }

        public void start() {
            System.out.println("Machine is started");
        }
    }

    static class Camera extends Machine {
        public String toString() {
            return "I am Camera";
        }
    }
}
