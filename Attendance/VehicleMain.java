public class VehicleMain {
    public static void main(String[] args) {
        ToyotaVios toyotaVios = new ToyotaVios(100, "Red", 25000.0, "Tubeless");
        toyotaVios.drive();
        toyotaVios.stop();

        U2SpyPlane u2SpyPlane = new U2SpyPlane(500, "Gray", 1000000.0, 50.5);
        u2SpyPlane.fly();
        u2SpyPlane.stop();

        FandangoYacht fandangoYacht = new FandangoYacht(30, "White", 500000.0, "Blue");
        fandangoYacht.float();
        fandangoYacht.stop();
    }
}
