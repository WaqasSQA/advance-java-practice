package org.example;

public class constructor {
    int seats;
    int windows;
    int horns;
     public void starts(){
         System.out.println("This car starts");
     }

     public constructor(){
         seats = 4;
         windows = 4;
     }
     public constructor (int number){
         seats = number;
     }
     public constructor (int a, int b){
         seats = a;
         windows = b;
     }

     public constructor (constructor c){
         seats = c.seats;
         windows = c.windows;
     }
    public static void main(String[] args) {
        constructor car1 = new constructor();

        car1.horns = 2;
        car1.starts();
        System.out.println(car1.seats);
        System.out.println(car1.windows);
        System.out.println(car1.horns);
        System.out.println("************************");

        constructor car2 = new constructor(7, 5);

        car2.horns =1;
        car2.starts();
        System.out.println(car2.seats);
        System.out.println(car2.windows);
        System.out.println(car2.horns);
        System.out.println("*************************");

        constructor car3 = new constructor(car2);
        car3.horns = 5;
        System.out.println(car3.horns);
        System.out.println(car3.seats);
        System.out.println(car3.windows);
    }
}