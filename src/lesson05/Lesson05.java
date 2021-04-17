package lesson05;

public class Lesson05 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Horse horse = new Horse();
        Cat cat = new Cat();
        Bird bird = new Bird();

        dog.run(300);
        dog.jump(0.5f);
        horse.swim(90);
        horse.jump(5);
        cat.run(201);
        cat.swim(2);
        bird.run(5);
        bird.jump(0.3f);


    }
}
