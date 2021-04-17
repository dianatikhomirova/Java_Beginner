package lesson05;

public class Bird extends Animal {

    public Bird() {
        super("Птенчик",5, 0, 0.2f);
    }

    @Override
    protected void swim(float distance) {
        System.out.println(this.name + " не может плавать");
    }
}
