package ru.geekbrins.lesson6;

public class Dog extends Animal {

    public Dog(String name){
        super(name);
    }

    @Override
    public int run(int distance) {
        if(distance < 500){
            return super.run(distance);
        }else {
            System.out.println("Собаки не бегают более 500м!");
        }return 0;
    }

    @Override
    public void swim(int distance) {
        if(distance < 10){
            super.swim(distance);
        }else {
            System.out.println("Собаки не плавают более 10м!");
        }

    }
}
