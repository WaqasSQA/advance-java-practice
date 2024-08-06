package customObjects;

import java.util.*;

class Person {
    private int id;
    private String name;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "ID is: " + id + " Name is: " + name;
    }
}

public class App {

    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Donald", 1);
        treeMap.put("Kamala", 2);
        treeMap.put("Donald", 1);

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("dog");
        treeSet.add("cat");
        treeSet.add("horse");
        treeSet.add("cat");

        for (String key : treeMap.keySet()) {
            // System.out.println(key + " " + treeMap.get(key));
        }

        // System.out.println(treeSet);

        Person p1 = new Person("Trump", 1);
        Person p2 = new Person("Biden", 2);
        Person p3 = new Person("Joe", 3);
        Person p4 = new Person("Biden", 2);

        Map<Person, Integer> map = new LinkedHashMap<>();

        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);
        map.put(p4, 4);

        for (Person p : map.keySet()) {
            System.out.println(p + " " + map.get(p));
        }

        Set<Person> person = new LinkedHashSet<>();
        person.add(p1);
        person.add(p2);
        person.add(p3);
        person.add(p4);

        System.out.println(person);
    }
}
