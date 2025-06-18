abstract class Animal {
    abstract void makeSound();

    public void sleep(){        // 상속 그대로 사용
        System.out.println("Zzz... 자는중...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound(){       // 오버라이딩
        System.out.println("멍멍!");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.makeSound();
        dog.sleep();
    }
}