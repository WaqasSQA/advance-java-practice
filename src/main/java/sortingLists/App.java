package sortingLists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class AlphabeticalOrder implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

class ReverseAlphabeticalOrder implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}
class stringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {

        int len1 = s1.length();
        int len2 = s2.length();

        if(len1 > len2){
            return -1;
        }
        else if (len1 < len2){
            return 1;
        }
        return 0;
    }
}
public class App {
    public static void main(String[] args) {

        /////////Comparing Strings///////////
        List<String> animals = new ArrayList<>();

        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Goose");
        animals.add("Ape");
        animals.add("Dog");
        animals.add("Giraffe");

        animals.sort(new stringLengthComparator());

        for(String ani : animals){
            System.out.println(ani);
        }

        System.out.println("\n");

        ///////Comparing Numbers/////////

        List<Integer> numb = new ArrayList<>();

        numb.add(10);
        numb.add(1);
        numb.add(3);
        numb.add(45);

        numb.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
        for (Integer number : numb){
            System.out.println(number);
        }


        System.out.println("==============================================================");
        System.out.println("\n");
        ///////Comparing Objects///////////

        List<Person> person = new ArrayList<>();
        person.add(new Person("Donald", 1));
        person.add(new Person("Cammie", 5));
        person.add(new Person("Shaymo", 2));
        person.add(new Person("Micheal", 4));
        person.add(new Person("Shees", 3));


        ////On Numbers (id)
        person.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                if(o1.getId() > o2.getId()){
                    return 1;
                }
                else if(o1.getId() < o2.getId()){
                    return -1;
                }
                return 0;
            }
        });

        //// On Names
        person.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Person p : person){
            System.out.println(p);
        }
    }
}

class Person{
    private int id;
    private String name;

    public Person(String name, int id){
        this.id=id;
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String toString(){
        return "ID : " + id + " Name : "+ name;
    }
}
