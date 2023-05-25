class FandangoYacht extends Vehicle {
    private String mainSailColor;

    public FandangoYacht(int speed, String color, double price, String mainSailColor) {
        super(speed, color, price);
        this.mainSailColor = mainSailColor;
    }

    public void float() {
        System.out.println("Fandango Yacht is floating.");
    }
}
