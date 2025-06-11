class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("안녕하세요 저는 " + name + "이고, 나이는 " + age + "입니다.");
    }
}


public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("한철규", 27);
        Person p2 = new Person("신태희", 24);
        p1.sayHello();
        p2.sayHello();

    }
}
