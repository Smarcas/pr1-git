package local.ex4;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bicycle bici = new Bicycle(7);
        Car coche = new Car(16);
        int eleccion = 0, km = 0;
        do {
            System.out.println("Indique la acción que quiere realizar entre:");
            System.out.println("1. Correr bicicleta\n2. Hacer caballito\n3. Correr coche\n4. Quemar ruedas\n5. Mostrar km bicicleta\n6. Mostrar km coche\n7. Mostrar total km\n8. Salir programa");
            eleccion = input.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.print("¿Cuántos km has recorrido? ");
                    km = input.nextInt();
                    bici.travel(km);
                    break;
                case 2:
                    bici.hacercaballito();
                    break;
                case 3:
                    System.out.print("¿Cuántos km has recorrido? ");
                    km = input.nextInt();
                    coche.travel(km);
                    break;
                case 4:
                    coche.quemarRueda();
                    break;
                case 5:
                    System.out.println("La bicicleta ha recorrido: " + bici.getKmRecorridos() + " km.");
                    break;
                case 6:
                    System.out.println("El coche ha recorrido: " + coche.getKmRecorridos() + " km.");
                    break;
                case 7:
                    System.out.println("El coche y la bici han recorrido: " + Vehicle.getKmTotal() + " km en total.");
                    break;
                default:
                    System.out.println("El número introducido no es válido.");
                    break;
            }
        } while (eleccion!=8);
        input.close();
        System.out.print("Nos vemos.");
    }
}
