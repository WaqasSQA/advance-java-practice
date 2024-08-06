package ENUM;

public class App {

    public static void main(String[] args) {
        Animal animal = Animal.DOG;
        switch (animal){
            case CAT:
                System.out.println("this is cat");
                break;

            case DOG:
                System.out.println("this is dog");
                break;

            case MOUSE:
                System.out.println("this is mouse");
                break;
        }
        System.out.println(Animal.DOG.getClass());
        System.out.println(Animal.MOUSE.getName());
        System.out.println(Animal.CAT);

        //this is used to get the ENUM name after declaring toStrign method in the enum class
        //Because before declaring toString method Animal.CAT retruns CAT
        System.out.println("Enum name " + Animal.CAT.name());

        Animal animal1 = Animal.valueOf("CAT");
        System.out.println(animal1);
    }
}
