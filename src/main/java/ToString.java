
class frog {
    private String name;
    private int id;

    public frog(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        //String Builder method
        //StringBuilder sb = new StringBuilder();
        //sb.append(id).append(" ").append(name);

        //formatting method
        return String.format("%d %s", id, name);
    }
}

public class ToString {
    public static void main(String[] args) {
        frog f = new frog("Yousma", 1);
        frog f1 = new frog("Siddiqui", 2);
        System.out.println(f);
        System.out.println(f1);

    }
}