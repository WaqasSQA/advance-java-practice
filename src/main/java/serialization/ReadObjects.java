package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading Objects");

        try(FileInputStream Is = new FileInputStream("people.bin")){

            ObjectInputStream Oi = new ObjectInputStream(Is);
            Person person1 = (Person) Oi.readObject();
            Person person2 = (Person) Oi.readObject();

            Oi.close();

            System.out.println(person1);
            System.out.println(person2);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
