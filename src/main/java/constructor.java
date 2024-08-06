public class constructor {

    private String name;
    private int code;
    public constructor(){
       this("yousma", 9);
        System.out.println("First constructor");
    }

    public constructor(String name){
        this();
        System.out.println("Second constructor");
        this.name = name;
    }
    public constructor(String name, int code){


        System.out.println("Third constructor");
        this.name = name;
        this.code = code;
    }

    public static void main(String[] args) {
    constructor c = new constructor();
    constructor c1 = new constructor("Yousma");
    constructor c2 = new constructor("yousma", 9);

    }

}
