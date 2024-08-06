package fileWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        File file = new File("test1.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            bufferedWriter.write("Hello 1st line");
            bufferedWriter.write("Hello 2nd line");
            bufferedWriter.newLine();
            bufferedWriter.write("Hello 3rd line");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
