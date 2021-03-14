package ru.geekbrins.lesson6;

public class Animal {

    protected String name;
    //protected Integer distance;
    protected static Integer count=0;

    public Animal(String name) {
        this.name = name;
        count++;
    }
    public int run(int distance){
        System.out.println(name + " пробежал: " + distance + "м" );
        return distance;
    }
    public void swim(int distance){
        System.out.println(name + " проплыл: " + distance);
    }
}
