package Objetos;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Caballo caballo1 = new Caballo("hembra", "raza");
        Caballo caballo2 = new Caballo("macho", "raza");
        caballo1.trota();
        caballo1.come();
        caballo1.relincha();
        caballo1.compite(caballo2);
    }
}
