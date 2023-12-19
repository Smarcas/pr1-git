package local.ex6;

public class Telefono {
    // ATRIBUTOS
    protected int numero;
    protected int segundos;
    protected static int segundostotales;
    // CONSTRUCTOR
    public Telefono (int numero) {
        this.numero = numero;
        this.segundos = 0;
    }
    // TOSTRING
    @Override
    public String toString() {
        return "Nº: " + this.getNumero() + " ha llamado durante " + this.getSegundos() + " segundos.";
    }
    // GETTER
    public int getNumero() {
        return numero;
    }
    public int getSegundos() {
        return segundos;
    }
    public static int getSegundosTotales() {
        return segundostotales;
    }
    // SETTER
    public void setNumero(int numero) {
        this.numero = numero;
    }
    // METHODS
    public void setSegundos(int segundos) {
        this.segundos=segundos;
    }
    public void llamar(Telefono telefono1, int segundos) {
        Telefono.segundostotales+=segundos;
        this.segundos+=segundos;
        telefono1.segundos+=segundos;
    }
}
