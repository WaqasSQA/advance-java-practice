package anonymousClass;

public class AnonymousClass {
    public static void main(String[] args) {
    Machine machine = new Machine(){
        ///This is overriden by an anonymous class
        @Override
        public void Start() {
            System.out.println("Camera is started");
        }
    };
    machine.Start();
        Plant plant = new Plant() {
            public void grow(){
                System.out.println("Plant is growing");
            }
        };
        plant.grow();
    }
}
class Machine{
    public void Start(){
        System.out.println("Machine is starting...");
    }
}
interface Plant{
    public void grow();
}
