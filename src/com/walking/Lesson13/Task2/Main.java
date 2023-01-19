package com.walking.Lesson13.Task2;

import com.walking.Lesson13.Task2.Model.Animal;
import com.walking.Lesson13.Task2.Model.Cat;
import com.walking.Lesson13.Task2.Model.Cow;
import com.walking.Lesson13.Task2.Model.Dog;

/**
 * Реализуйте класс Animal. Реализуйте его наследников: Dog, Cat, Cow.
 * Каждый из наследников должен содержать свой метод: woof(), meow() и moo() соответственно.
 * Остальные поля и методы суперкласса и наследников реализовать по своему усмотрению, если они необходимы.
 * Каждый из методов должен выводить в консоль соответствующую ему строку: "woof ", "meow " или "moo".
 * В main() создать и наполнить в произвольном порядке объектами разных классов-наследников массив типа Animal.
 * Реализовать метод, принимающий массив Animal и вызывающий метод, характерный для конкретного животного.
 * Использовать при решении instanceof, getClass() или другие неизвестные нам механики – недопустимо.
 * Дополнительное условие (необязательно): решить задачу, при условии, что woof(), meow() и moo()
 * внутри себя выполняют только вызов protected-метода sound(), который определен в Animal.
 * Примечание: не забывайте об использовании пакетов.
 * Название продуктов (пакет 3-го уровня) для задач текущего урока предлагаю выбрать самостоятельно.
 */
public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog("Mike", 4);
        Animal cat = new Cat("Barsik", "black");
        Animal cow = new Cow("Murka", false);

        Animal[] animals = {dog, cat, cow};
        animalAll(animals);


    }

    public static void animalAll(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sound();

        }

    }


}
