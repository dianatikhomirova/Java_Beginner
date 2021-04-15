package lesson05;

public abstract class Animal {

    protected String name;
    private float maxRun;
    private float maxSwim;
    private float maxJump;

    public Animal(String name, float maxRun, float maxSwim, float maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
    }

    protected void run(float distance) {
        if (distance > maxRun) {
            System.out.println(name + " не может пробежать данную дистанцию");
        } else {
            System.out.println(name + " пробежал");
        }
    }

    protected void swim(float distance) {
        if (distance > maxSwim) {
            System.out.println(name + " не может проплыть заданную дистанцию");
        } else {
            System.out.println(name + " проплыл");
        }
    }

    protected void jump(float distance) {
        if (distance > maxJump) {
            System.out.println(name + " не может прыгнуть на заданную высоту");
        } else {
            System.out.println(name + " прыгнул");
        }
    }
}
