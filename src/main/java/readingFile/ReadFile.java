package readingFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) throws FileNotFoundException {

        String filename = "C:\\Users\\dev\\Desktop\\Read.txt";
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        int value = scanner.nextInt();
        System.out.println("Read : "+value);

        scanner.nextLine();
        int count = 2;
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(count +":" +line);
            count++;
        }
        scanner.close();
    }
}
