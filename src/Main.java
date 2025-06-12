class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void printName(String name) {
        System.out.println("Animal name: " + name + this.name);
    }

}

class Dog extends Animal {
    // String name;     생략 가능
    String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
}


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("코코", "말티즈");

        dog.printName("쿠키");

    }
}