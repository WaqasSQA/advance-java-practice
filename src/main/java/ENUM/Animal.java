package ENUM;

public enum Animal{
    CAT("shaymo"), DOG("Huskey"), MOUSE("Jerry");
    private String name;
    Animal(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "This animal is " + name;
    }
}