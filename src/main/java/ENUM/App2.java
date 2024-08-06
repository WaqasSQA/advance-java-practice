package ENUM;

public class App2 {
    //Why ENUM was used
    // This code is before enum existed

   public static final int CAT =0;
    public static final int DOG = 1;
    public static final int MOUSE = 2;

    public static void main(String[] args) {
        int animal = DOG;

        switch (animal){
            case CAT:
                System.out.println("This is cat");
                break;
            case DOG:
                System.out.println("This is dog");
                break;
            case MOUSE:
                System.out.println("This is mouse");
        }
    }
}
