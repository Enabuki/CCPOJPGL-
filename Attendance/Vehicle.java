class Vehicle {
    private int speed;
    private String color;
    private double price;

    public Vehicle(int speed, String color, double price) {
        this.speed = speed;
        this.color = color;
        this.price = price;
    }

    public void stop() {
        System.out.println("Vehicle has stopped.");
    }
}
