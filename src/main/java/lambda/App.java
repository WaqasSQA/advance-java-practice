package lambda;


interface Executable {
    int execute(int a, int b);
}

interface stringExecutable {
    int execute (String a);
}
class Runable {
    public void run(Executable executable){
        System.out.println("Running runner");
       int value = executable.execute(13, 12);
        System.out.println("Value is : " + value);
    }

    public void run(stringExecutable stringExecutable){
        System.out.println("String Executable");
        int value = stringExecutable.execute("Hello");
        System.out.println("String is " + value);
    }
}


// runable.run(() -> System.out.println("Lambda running"));

/* runable.run(() -> {
        System.out.println("Lambda 1");
           System.out.println("Lambda running");
          });
*/

/*
      runable.run(() -> {
            return 10;
        });
 */

//runable.run((int a) -> 10 + a);

public class App {
    public static void main(String[] args) {
        Runable runable = new Runable();

        // In older java to use a variable in the anonymous class we had to declare it final
        // But with new java we don't have to declare it final to use in anonymous class
        int c = 80;
        runable.run(new Executable() {
            @Override
            public int execute(int a, int b) {
                System.out.println("Hello Executable");
                return c + b + a;
            }
        });
        System.out.println("==================================================");

        // In lambda expression t doesn't have its own block so any variable so any variable declared in upper block cannot be declared in the lambda block
        runable.run((a, b) -> 6 + a);

        System.out.println("==================================================");

        //This is also a form of lambda expression

        Executable ex = (a, b) -> 6 + a;
        runable.run(ex);

        System.out.println("==================================================");

        //This is also a form of lambda expression
        //We have to cast this Object type in to that specific interface to make it work
        Object codeBlock = (Executable) (a, b) -> 6 + a;
        runable.run((Executable) codeBlock);

    }

}
