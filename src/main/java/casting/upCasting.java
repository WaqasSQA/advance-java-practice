package casting;

class Machine {
    public void start(){
        System.out.println("Machine Started");
    }
}
class Camera extends Machine {
    public void start(){
        System.out.println("Camera Started");
    }
    public void snap(){
        System.out.println("Snap taken");
    }
}

public class upCasting {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        //Upcasting
        Machine machine2 = camera1;
        machine2.start();

        //Downcasting
        Machine machine3 = new Camera();
        Camera camera2 = (Camera) machine3;
        camera2.start();
        camera2.snap();

        // This wont work becuase we are trying to access camera mehtods when the actual object is Machine
        //Gives --runtime error
        Machine machine4 = new Machine();
        Camera camera3 = (Camera) machine4;
        camera3.start();
        camera3.snap();
    }
}
