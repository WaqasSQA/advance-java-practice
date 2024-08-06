package polymorphism;

public class tree extends plant{

    @Override
    public void grows() {
        System.out.println("Tree Grows");
    }

    public void shedLeaves (){
        System.out.println("Leaves are shedding");
    }
}
