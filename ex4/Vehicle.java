package local.ex4;

public class Vehicle {
    // ATRIBUTOS
    private static int kmTotal = 0;
    private static int numtotalvehicle = 0;
    private int kmRecorridos;
    // CONSTRUCTOR
    public Vehicle() {
        Vehicle.numtotalvehicle++;
        this.kmRecorridos = 0;
    }
    // GETTER
    public static int getKmTotal() {
        return kmTotal;
    }
    public int getKmRecorridos() {
        return this.kmRecorridos;
    }
    // OTHERS
    public void travel(int km) {
        this.kmRecorridos+=km;
        Vehicle.kmTotal+=km;
    }
}
