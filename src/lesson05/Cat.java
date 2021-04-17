package lesson05;

public class Cat extends Animal {

    public Cat() {
        super("Котик",200, 0, 2);
    }

    @Override
    protected void swim(float distance) {
        System.out.println(this.name + " не может плавать");
    }
}