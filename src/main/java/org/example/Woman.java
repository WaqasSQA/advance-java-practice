package org.example;

public class Woman implements interfaceEx{

    @Override
    public void eat() {
        System.out.println("woman can eat slow");
    }
    @Override
    public void run(){
        System.out.println("woman can run slow");
    }

    public static void main(String[] args) {
        Woman woman = new Woman();
        woman.eat();
        woman.run();
    }
}