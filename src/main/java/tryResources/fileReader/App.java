package tryResources.fileReader;

import java.io.*;

public class App {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\dev\\Desktop\\Read.txt");

       try(BufferedReader br = new BufferedReader(new FileReader(file))){
           String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
       } catch (FileNotFoundException e) {
           System.out.println("File not found " + file.toString());
       } catch (IOException e) {
           System.out.println("Unable to locate the file");
       }
    }
}
