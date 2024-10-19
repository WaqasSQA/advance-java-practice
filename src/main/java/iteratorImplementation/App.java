package iteratorImplementation;

public class App {
    public static void main(String[] args) {
        UrlLiberary urlLiberary = new UrlLiberary();

        for(String html : urlLiberary){
            System.out.println(html.length());
            System.out.println(html);
        }
    }
}
