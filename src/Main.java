interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("야옹!");
    }
}

class Cow implements Animal {
    public void makeSound() {
        System.out.println("음메!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Cow()
        };

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}