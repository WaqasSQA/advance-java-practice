public class staticLearn {
    public static final int NUMBER =0;

    public static int count = 0;

    public int id;

    public staticLearn(){
        id = count;
        System.out.println(id);
        count++;
    }
    public String name;
    public String address;

    public static String description;

    public void showName (){
       System.out.println("ID is : " + id);
    }

    public static void showDescription(){
        System.out.println(description);
    }

    public static void main(String[] args) {

        //System.out.println("Before count :" + count);
        staticLearn obj = new staticLearn();
        staticLearn obj2 = new staticLearn();
        staticLearn obj3 = new staticLearn();
        //System.out.println("After count :" + count);

        obj.name = "Yousma";
        obj.address= "Lahore";

        obj.showName();
        obj2.showName();
        obj3.showName();
    }
}
