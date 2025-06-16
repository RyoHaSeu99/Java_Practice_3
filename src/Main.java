class Person {
    public static void greet() {
        System.out.println("hello from static method!");
}
    public void sayHello() {
        System.out.println("Hello from instance method!");
    }
    public static void main(String[] args) {
        Person.greet();

        Person p = new Person();
        p.sayHello();
    }
}