class U2SpyPlane extends Vehicle {
    private double wingsSpan;

    public U2SpyPlane(int speed, String color, double price, double wingsSpan) {
        super(speed, color, price);
        this.wingsSpan = wingsSpan;
    }

    public void fly() {
        System.out.println("U-2 Spy Plane is flying.");
    }
}
