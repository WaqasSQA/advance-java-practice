public class getter {
    public static void main(String[] args) {
    person p = new person();
    p.name = "Yousma";
    p.age = 25;

    int checkYears = p.yearsToRetire();
    String nameNew = p.getName();
    int ageNew = p.getAge();

        System.out.println("My name is "+nameNew+" and my age is "+ageNew+ " my years before retirement are "+checkYears);
    }
}
class person {
    String name;
    int age;

    int yearsToRetire (){
        return 65- age;
    }

    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}
