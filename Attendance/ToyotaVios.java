class ToyotaVios extends Vehicle {
    private String tireType;

    public ToyotaVios(int speed, String color, double price, String tireType) {
        super(speed, color, price);
        this.tireType = tireType;
    }

    public void drive() {
        System.out.println("Toyota VIOS is driving.");
    }
}
