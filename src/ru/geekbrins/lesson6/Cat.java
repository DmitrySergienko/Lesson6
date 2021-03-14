package ru.geekbrins.lesson6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не плавают!");
    }

    @Override
    public int run(int distance) {
        if(distance < 200){
        return super.run(distance);
    }else {
            System.out.println("Коты не бегают более 200м!");
        }return 0;
    }

}
