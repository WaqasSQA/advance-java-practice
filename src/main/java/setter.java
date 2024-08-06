public class setter {
    public static void main(String[] args) {
    girl g = new girl();
    g.setAge(25);
    g.setName("yousma");
        System.out.println(g.getName() + g.getAge());
    }
}
class girl {
    private String name;
    private int age;

    public void setName(String name){
       this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}