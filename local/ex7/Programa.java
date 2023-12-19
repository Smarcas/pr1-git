package local.ex7;

public class Programa {
    public static void main(String[] args) {
        Tarjeta t1 = new Tarjeta(654);
        System.out.println(t1);
        System.out.println("Primer pago: 300€");
        t1.pagar(300);
        System.out.println("\nSegundo pago: 400€");
        t1.pagar(400);
        Tarjeta t2 = new Tarjeta(300);
        System.out.println("\nAhora vamos a fusionar las dos primeras tarjetas para poder pagar.");
        System.out.println(t1);
        System.out.println(t2);
        // Fusionar dos tarjetas
        Tarjeta t3 = new Tarjeta(t1, t2);
        System.out.println(t3);
        System.out.println("\nComprobamos que el saldo de las tarjetas se ha puesto a 0€");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println("\nSegundo pago (400€) a la tarjeta fusionada.");
        t3.pagar(400);
        System.out.println(t3);
    }
}
