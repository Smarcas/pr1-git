package local.ex10;

public class Programa {
    public static void main(String[] args) {
        Incidencia i1 = new Incidencia(14, "El ordenador no enciende.");
        Incidencia i2 = new Incidencia(304, "El cable está roto.");
        Incidencia i3 = new Incidencia(3, "El ratón funciona de forma intermitente.");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        i1.resolver("El cable de alimentación estaba desconectado.");
        i2.resolver("Hemos cambiado el cable.");
        System.out.print("\n");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("Pendientes: " + Incidencia.getPendientes());
    }
}
