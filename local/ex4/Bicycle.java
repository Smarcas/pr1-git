package local.ex4;

public class Bicycle extends Vehicle {
    /// ATRIBUTOS
    private int piñones;
    /// CONSTRUCTOR
    public Bicycle (int piñones) {
        super();
        this.piñones = piñones;
    }
    /// MÉTODOS
    public void hacercaballito() {
        System.out.println("Hace el caballito con la bicicleta.");
    }
}
