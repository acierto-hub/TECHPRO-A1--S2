class Vehicle {
    protected String brand = "Dodge Hellcat";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}
class Car extends Vehicle {
    private String modelName = "Dodge Challenger";
    public static void main(String[] args) {
        Car myFastCar = new Car();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
}
