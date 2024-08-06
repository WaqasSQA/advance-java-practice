package tryResources;


class Temp implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Closing!");
        throw new Exception("Oh nooo");
    }
}
public class App {
    public static void main(String[] args) {
        try(Temp tmp = new Temp()){
        // its in try block so its gonna run the method of interface anyway
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
