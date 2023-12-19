package local.ex4;

public class Car extends Vehicle {
    /// ATRIBUTOS
    private int cilindrada;
    /// CONSTRUCTOR
    public Car (int cilindrada) {
        super();
        this.cilindrada = cilindrada;
    }
    /// MÉTODOS
    public void quemarRueda() {
        System.out.println("FSSSSSS.");
    }
}
