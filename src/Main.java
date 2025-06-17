class Animal {
    void makeSound() {
        System.out.println("울음 소리");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("멍멍!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("야옹!");
    }
}

class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("꽤액!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Bird();

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();

    }
}