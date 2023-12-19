import java.util.Scanner;

public class Repaso_examen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] mesa = new int[10];
        int comensales = 0, numeromesa = 0;
        boolean cabe = false;
        llenar(mesa); // Llenamos las mesas por primera vez

        do {
            System.out.println(mostrarmesas(mesa)); // Mostramos las mesas
            cabe = false;
            numeromesa = 0;
            System.out.print("¿Cuántos son? Si quiere terminar el programa, inserte 0: ");
            comensales = input.nextInt();
            if (comensales>0 && comensales<=4) {
                for (int cont=0; cont<mesa.length; cont++) {
                    if (mesa[cont]==0) {
                        cabe = true;
                        numeromesa = cont;
                        break;
                    }
                }
                for (int cont=0; cont<mesa.length; cont++) {
                    if (cabe==false && comensales<=(4-mesa[cont])) {
                        cabe = true;
                        numeromesa = cont;
                        break;
                    }
                }
                if (cabe==true) {
                    System.out.println("Tenemos hueco en la mesa " + (numeromesa+1) + ".");
                    mesa[numeromesa] = mesa[numeromesa] + comensales;
                } else {
                    System.out.println("No nos quedan mesas para " + comensales + " personas.");
                }
            } else if (comensales>4) {
                System.out.println("Los grupos pueden ser de, cómo máximo, 4 comensales. Por favor, divídelos en grupos menores.");
            } else if (comensales<0) {
                System.out.println("No puede insertar un valor negativo.");
            }
        } while (comensales>0 && mesasllenas(mesa)<10);
        if (mesasllenas(mesa)==10) {
            System.out.print("Todas las mesas están llenas, ¡nos vemos!");
        } else {
            System.out.print("¡Nos vemos!");
        }
    }

    // Función para mostrar las mesas
    public static String mostrarmesas(int[] array) {
        String mesas = "COMENSALES: ";
        System.out.println("\n      MESA: | 1   2   3   4   5   6   7   8   9   10|");
        for (int cont=0; cont<array.length; cont++) {
            mesas = mesas + "| " + array[cont] + " ";
        }
        mesas = mesas + "|";
        return mesas;
    }
    // Función para llenar un array
    public static void llenar(int[] array) {
        for (int cont=0; cont<array.length; cont++) {
            array[cont] = (int) (Math.random()*5);
        }
    }
    // Función para comprobar el número de mesas llenas
    public static int mesasllenas(int[] array) {
        int nmesas = 0;
        for (int cont=0; cont<array.length; cont++) {
            if (array[cont] ==4) {
                nmesas++;
            }
        }
        return nmesas;
    }
}