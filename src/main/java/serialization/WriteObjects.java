package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
    public static void main(String[] args) {
        Person donald = new Person(1, "Donlad");
        Person sue = new Person(2, "Sue");

        System.out.println(donald);
        System.out.println(sue);

        try(FileOutputStream fs = new FileOutputStream("people.bin")){

            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(donald);
            os.writeObject(sue);

            os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
