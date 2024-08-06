package interfaces;

public class Machine implements Info {

    private int id = 7;
    public void start(){
        System.out.println("Machine started");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine id : " + id);
    }
    public void run(){
        System.out.println("Car can run");
    }
}
