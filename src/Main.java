class Person {
    static String a = "static";
    String b = "instance";

    public static void greed() {
        System.out.println("Hello from static method!");
    }

    public void sayHello() {
        System.out.println("Hello from instance method!");
    }
}

public class Main {
    public static void main(String[] args) {
        // static 멤버는 클래스 이름으로 직접 호출
        Person.greed();
        System.out.println(Person.a);

        // 인스턴스 멤버는 객체 생성 후 객체 이름으로 호출
        Person p = new Person();
        p.sayHello();
        System.out.println(p.b);
    }
}