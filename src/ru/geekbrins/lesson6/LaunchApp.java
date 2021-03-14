package ru.geekbrins.lesson6;

import static ru.geekbrins.lesson6.Animal.count;


public class LaunchApp {
    public static void main(String[] args) {
        Animal dogSharik= new Dog("Шарик");
        Animal catFantik = new Cat("Фантик");

        dogSharik.run(60);
        dogSharik.swim(10);
        catFantik.swim(10);
        catFantik.run(2000);

        System.out.println("Всего было создано: " + count + " животных");



    }
}
