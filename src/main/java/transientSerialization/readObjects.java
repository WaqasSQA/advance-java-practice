package transientSerialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class readObjects {
    public static void main(String[] args) {
        try(ObjectInputStream os = new ObjectInputStream(Files.newInputStream(Paths.get("test.ser")))){
            Person person = (Person) os.readObject();
            System.out.println(person);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
