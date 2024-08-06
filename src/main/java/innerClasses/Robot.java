package innerClasses;

public class Robot {
    private int id;

    public class Brain {
        public void think(){
            System.out.println("Robot "+ id + " is thinking");
        }
    }

    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging ");
        }
    }

    public Robot (int id){
        this.id = id;
    }

    public void Start(){
        System.out.println("Robot starting " + id);

        Brain brain = new Brain();
        brain.think();

        String name = "Rob";
        class Temp {
            public void doSomething (){
                System.out.println("This is ID: " + id + "This is name " + name);
            }
        }
        Temp tmp = new Temp();
        tmp.doSomething();
    }
}
