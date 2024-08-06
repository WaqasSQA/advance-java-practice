package serializationArrays;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class readingObjects {
    public static void main(String[] args) {
        System.out.println("Reading Objects");

        try(FileInputStream fi = new FileInputStream("people2.bin");
            ObjectInputStream os = new ObjectInputStream(fi)){

            Person[] people = (Person[])os.readObject();

            //We have to suppress warning here because when using ArrayList in serialization the ArrayList<Person>
            //type is lost during compilation, so we will use annotation here

            @SuppressWarnings("unchecked")
            ArrayList<Person> peopleList = (ArrayList<Person>)os.readObject();

            for(Person person : people){
                System.out.println(person);
            }
            for(Person person : peopleList){
                System.out.println(person);
            }

            int num = os.readInt();

            for (int i=0; i<num; i++){
                Person person = (Person) os.readObject();
                System.out.println(person);
            }

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
