package exceptionHandling;

import java.io.IOException;
import java.text.ParseException;

public class App {
    public static void main(String[] args) {
        Test test = new Test();

        try {
            test.run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
