package innerClasses;

public class App {

    public static void main(String[] args) {
        Robot robot = new Robot(5);
        robot.Start();

        // This will only work if the Brain class is public
        Robot.Brain brain = robot.new Brain();
        brain.think();

        Robot.Battery battery = new Robot.Battery();
        battery.charge();
    }
}
