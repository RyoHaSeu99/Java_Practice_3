class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Animal name: " + name);
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void printName() {
        System.out.println("Dog name: " + name);
        System.out.println("Breed: " + breed);
    }
}


public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("코코", "말티즈");

        dog.printName();
    }
}