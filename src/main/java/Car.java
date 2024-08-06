public class Car extends Machine{
  @Override
 public void start(){
     System.out.println("Car started");
 }
 public void windSheild(){
     System.out.println("Windshield wipped");
 }
 @Override
 public void stop(){
     System.out.println("Car stopped");
 }
 public void show(){
     System.out.println(name);
 }
}
