package polymorphism;

public class App {

    public static void doGrow(plant p){
        p.grows();
    }

    public static void main(String[] args) {
        plant p = new plant();
        tree t = new tree();

        plant p2 = t;

        p2.grows();
        p.grows();
        t.shedLeaves();

        doGrow(p2);
    }
}
