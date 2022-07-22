package gb.homework_6;

import java.util.Random;

abstract class Animals {

    protected String name;
    protected String animal;
    protected int limitRun;
    protected int limitSwim;
    protected double limitJump;
    public Random random = new Random();

    public Animals(String name){
        this.name = name;
    }

    public void run(int dist) {
        if (this.limitRun >= dist) System.out.println(this.animal + " " + this.name + " пробегает: " + dist + " м.");
        else System.out.println(this.animal + " " + this.name + " не может бежать так далеко");
    }

    public void jump(double height) {
        if (this.limitJump >= height)
            System.out.println(this.animal + " " + this.name + " прыгает: " + height + " м.");
        else System.out.println(this.animal + " " + this.name + " не может прыгнуть так высоко");
    }
    public void swim(int dist) {
        if (this.limitSwim >= dist) System.out.println(this.animal + " " + this.name + " проплывает: " + dist + " м.");
        else System.out.println(this.animal + " " + this.name + " не может плыть так далеко");
    }

    public void animalInfo() {
        System.out.println(this.animal + " " + this.name + " может пробежать: " + this.limitRun + " м., может проплыть: "
                + this.limitSwim
                + " м., может прыгнуть: " + this.limitJump + " m.");
    }
}
