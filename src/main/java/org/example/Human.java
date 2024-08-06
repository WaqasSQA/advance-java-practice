package org.example;

public class Human {

    int height;
    int weight;
    String gender;

    public void run(){
        System.out.println("Can run");
    }

    public void eat(){
        System.out.println("Can eat");
    }

    public void psy(){
        System.out.println(weight+height);
    }

    public static void main(String[] args) {
        Human boy1 = new Human();
        boy1.height = 6;
        boy1.weight = 60;
        boy1.gender = "male";
        boy1.run();
        boy1.eat();
        boy1.psy();

        System.out.println(boy1.weight);
        System.out.println(boy1.gender);
    }
}
