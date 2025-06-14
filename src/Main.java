class Person {
    String name;
    int age;

    public void sayHello() {
        System.out.printf("안녕하세요 제 이름은 %s이고 나이는 %d 입니다", name, age);
    }
}


public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "한철규";
        person.age = 27;

        person.sayHello();
    }
}