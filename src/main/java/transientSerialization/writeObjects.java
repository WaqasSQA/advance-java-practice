package transientSerialization;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class writeObjects {
    public static void main(String[] args) {
        System.out.println("Creating Objects...");

        try(ObjectOutputStream os = new ObjectOutputStream(Files.newOutputStream(Paths.get("test.ser")))){
            Person person = new Person(1, "donald");
            os.writeObject(person);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
