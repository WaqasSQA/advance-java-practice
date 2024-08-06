package equalsMethod;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return id == person.id && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(id);
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Person [id= " + id + ", name= " + name + " ]";
    }
}

public class App {
    public static void main(String[] args) {
        Person person1 = new Person(5, "Trump");
        Person person2 = new Person(5, "Trump");

        System.out.println(person1.equals(person2));
    }
}
