package interfaces;

public class App {
    public static void main(String[] args) {
        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person("Yousma");
        person1.greet();

        Info info = new Machine();
        info.showInfo();

        Info info1 = person1;

        info1.showInfo();

        outputInfo(mach1);
        outputInfo(person1);
    }
    private static void outputInfo (Info info){
        info.showInfo();
    }

}
