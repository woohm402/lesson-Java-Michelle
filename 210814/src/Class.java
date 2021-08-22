public class Class {
    public static void main(String[] args) {
        Cat c = new Cat(5, "Orange", "orange");

        System.out.println(c.pos);
        c.move();
        System.out.println(c.pos);

        c.pos = 10;
    }
}

class Cat {
    // attribute
    int age;
    String name;
    String color;
    int pos;

    // method
    Cat(int age, String name, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        System.out.println("Created: name is: " + name);
    }

    void introduce () {
        System.out.println("My name is " + name);
    }

    void cry () {
        System.out.println("meow");
    }

    void move() {
        this.pos = this.pos + 5;
    }
}
