package lesson1;

import javax.swing.plaf.synth.SynthOptionPaneUI;



public class DogTester {
    public static void main(String[] args) {

        // конструктор по-умолчанию
        Dog trezor = new Dog();

/*
        trezor.age = 5;
        trezor.name = "Trezor";
        trezor.breed = "Bulldog";
        trezor.color = "White";
*/

        trezor.setAge(5);
        trezor.setName("Trezor");
        trezor.setBreed("Bulldog");
        trezor.setColor("White");


        System.out.println("Tresor breed is: " + trezor.getBreed());

        Dog eleonora = new Dog("Bolonka", "Eleonora", 3, "White");

        System.out.println("Eleonora's age is: " + eleonora.getAge());

        eleonora.setAge(35);
        System.out.println("Eleonora's age is: " + eleonora.getAge());

        trezor.bark();
        eleonora.bark();

    }

}

// класс - объединение чего-либо по характерным признакам

class Dog {

    // конструктор - нужен чтобы правильно инициализировать свойства экземпляра класса
//    public Dog(String dogBreed, String dogName, int dogAge, String dogColor) {
//        breed = dogBreed;
//        name = dogName;
//        age = dogAge;
//        color = dogColor;
//    }
    // cmd+/
    // ctrl + /


    public Dog(String breed, String name, int age, String color) {
        // this - текущий экземпляр класса
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // конструктор по-умолчанию
    public Dog() {

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    // меняйте возраст собаки только если он больше 0 и меньше 30

    public void setAge(int age) {
        if(age > 0 && age < 30) {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // свойства == переменные класса == поля класса
    private String breed;
    private String name;
    private int age;
    private String color;

    // методы == функции == действия
    void bark() {
        System.out.println(name + " bark-bark!");
        int a = 5;
        int b= 10;
        a =b;

        final int d = 7;
        int e =12;
    }
    public static int numberOfDogs = 2;
}





