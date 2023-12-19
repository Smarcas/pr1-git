package local.ex5;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Zona principal = new Zona(1000);
        Zona compraventa = new Zona(200);
        Zona vip = new Zona(25);
        int eleccion = 0, eleccion2 = 0, entradas = 0;
        do {
            System.out.println("¿Qué quiere hacer?\n1. Mostrar número de entradas libres\n2. Comprar entradas\n3. Salir");
            eleccion = input.nextInt();
            if (eleccion == 1) {
                System.out.println("Zona principal: " + principal.getTickets());
                System.out.println("Zona compraventa: " + compraventa.getTickets());
                System.out.println("Zona vip: " + vip.getTickets() + "\n");
            } else if (eleccion == 2) {
                System.out.println("1. Principal\n2. Compraventa\n3. VIP");
                eleccion2 = input.nextInt();
                System.out.print("¿Cuántas entradas quieres? ");
                entradas = input.nextInt();
                switch (eleccion2) {
                    case 1:
                        principal.venderTickets(entradas);
                        break;
                    case 2:
                        compraventa.venderTickets(entradas);
                        break;
                    case 3:
                        vip.venderTickets(entradas);
                        break;
                    default:
                        System.out.println("Por favor, introduzca un número válido.");
                        break;
                }
            } else {
                System.out.println("Por favor, introduzca un número válido.");
            }
        } while (eleccion != 3) ;
        System.out.println("¡Nos vemos!");
        input.close();
    }
}