package serializationArrays;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class writtingObjects {
    public static void main(String[] args) {
        System.out.println("Creating Objects...");

        Person[] people = {new Person(1, "Milie"), new Person(2, "Bob"), new Person(3, "Jason")};

        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));


        try (FileOutputStream fs = new FileOutputStream("people2.bin"); ObjectOutputStream os = new ObjectOutputStream(fs)){
            os.writeObject(people);

            os.writeObject(peopleList);
            os.writeInt(peopleList.size());

            for (Person person : peopleList){
                os.writeObject(person);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
