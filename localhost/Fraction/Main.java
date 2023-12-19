package localhost.Fraction;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fraction fraction1 = new Fraction(0, 2);
        Fraction fraction2 = new Fraction(0, 2);
        Fraction fraction3 = new Fraction(0, 2);
        int operacion;
        System.out.println("¿Qué operación quieres realizar?\n  1. Multiplicar\n  2. Dividir\n  3. Revertir");
        operacion = input.nextInt();
        System.out.print("Indica el numerador y denominador de la primera fracción separados por un espacio: ");
        fraction1.setNumerador(input.nextInt());
        fraction1.setDenominador(input.nextInt());
        System.out.print("Indica el numerador y denominador de la segunda fracción separados por un espacio: ");
        fraction2.setNumerador(input.nextInt());
        fraction2.setDenominador(input.nextInt());
        switch (operacion) {
            case 1:
                fraction3.multiply(fraction1, fraction2);
                break;
            case 2:
                fraction3.divide(fraction1, fraction2);
                break;
            case 3:
                fraction1.reverse();
                fraction2.reverse();
                break;
            default:
                System.out.print("Elige una operación válida.");
                break;
        }
    }
}