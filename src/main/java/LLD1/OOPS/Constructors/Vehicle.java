package LLD1.OOPS.Constructors;

//Parameterized Constructor
public class Vehicle {

    String brand;
    String color;
    int year;

    public Vehicle(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Year: " + this.year);
    }

}
