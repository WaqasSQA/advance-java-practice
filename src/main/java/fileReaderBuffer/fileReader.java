package fileReaderBuffer;

import java.io.*;

public class fileReader {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\dev\\Desktop\\Read.txt");

        BufferedReader br = null;
        try {
            FileReader fr = new FileReader(file);
             br = new BufferedReader(fr);

            String line;
          while ( (line = br.readLine()) != null){
              System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + file.toString());;
        } catch (IOException e) {
            System.out.println("Unable to locate the file " + file.toString());
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Unable to locate the file " + file.toString());;
            }
            catch (NullPointerException ex){
                // File never opened
            }
        }
    }
}
