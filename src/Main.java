class Car {
    String brand;
    int year;


    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }


    public void displayInfo() {

            System.out.println(brand);
            System.out.println(year);
        }


}


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("현대", 20);
        Car car2 = new Car("기아", 24);

        car1.displayInfo();
        car2.displayInfo();
    }
}
