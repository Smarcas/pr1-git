import java.util.Scanner;

public class Ex12entradascine {

	public static void main(String[] args) {
		// Sergio Martínez del Castillo - Crear una calculadora de entradas de cine dependiendo del día de la semana.
		Scanner input = new Scanner(System.in);
		System.out.println("Bienvenido a Cines Córdoba: ");
		System.out.print("Indique el día de la semana (lunes, martes, miércoles, jueves, viernes, sábado o domingo): ");
		String diasemana = input.next();
		int numdia = 0;
		double entradas = 0;
		String carne = "";
		double total;
		double descuento = 0.90;
		String promocion = "";
		double descontado = 0;
		double preciofinal = 0;
		
		if (diasemana.equalsIgnoreCase("lunes") || diasemana.equalsIgnoreCase("martes") || diasemana.equalsIgnoreCase("viernes") || diasemana.equalsIgnoreCase("sábado") || diasemana.equalsIgnoreCase("sabado") || diasemana.equalsIgnoreCase("domingo")) {
			numdia = 1;
		} else if (diasemana.equalsIgnoreCase("miércoles") || diasemana.equalsIgnoreCase("miercoles") ) {
			numdia = 2;
		} else if (diasemana.equalsIgnoreCase("jueves")) {
			numdia = 3;
		} else {
			System.out.println("El día introducido no es válido.");
			System.exit(0);
		}
		System.out.print("Indique cuántas entradas quiere: ");
		entradas = input.nextInt();
		if (entradas>=1) {
		} else {
			System.out.println("El número introducido no es válido.");
			System.exit(0);
		}
		System.out.print("¿Tiene carne de estudiante? (sí o no): ");
		carne = input.next();
		if (carne.equalsIgnoreCase("sí") || carne.equalsIgnoreCase("si")) {
			descuento = 0.10;
			promocion = "10%";
		} else if (carne.equalsIgnoreCase("no")) {
			descuento = 0;
			promocion = "no";
		} else {
			System.out.println("Solo se admite sí/no.");
			System.exit(0);
		}
		switch (numdia) {
		case 1:
			total = entradas*8;
			descontado = total*descuento;
			System.out.println("Nº de tickets: " + entradas + "\nTipo de entrada: normal");
			System.out.println("Total: " + total + " €.");
			System.out.print("Descuento estudiante (" + promocion + "): ");
			System.out.printf("%.2f €", descontado);
			preciofinal = (total)-(total*descuento);
			System.out.printf("\nImporte a pagar: %.2f €.",  preciofinal);
			break;
		case 2:
			total = entradas*5;
			descontado = total*descuento;
			System.out.println("Nº de tickets: " + entradas + "\nTipo de entrada: día del cine");
			System.out.println("Total: " + total + " €.");
			System.out.print("Descuento estudiante (" + promocion + "): ");
			System.out.printf("%.2f €", descontado);
			preciofinal = (total)-(total*descuento);
			System.out.printf("\nImporte a pagar: %.2f €.",  preciofinal);
			break;
		case 3:
			if (entradas % 2 == 0) {
				total = (entradas/2)*11;
				descontado = total*descuento;
				System.out.println("Nº de tickets: " + entradas + "\nTipo de entrada: día de la pareja");
				System.out.println("Total: " + total + " €.");
				System.out.print("Descuento estudiante (" + promocion + "): ");
				System.out.printf("%.2f €", descontado);
				preciofinal = (total)-(total*descuento);
				System.out.printf("\nImporte a pagar: %.2f €.",  preciofinal);
			} else {
				total = (((entradas-1)/2)*11)+8;
				descontado = total*descuento;
				System.out.println("Nº de tickets: " + entradas + "\nTipo de entrada: día de la pareja + normal");
				System.out.println("Total: " + total + " €.");
				System.out.print("Descuento estudiante (" + promocion + "): ");
				System.out.printf("%.2f €", descontado);
				preciofinal = (total)-(total*descuento);
				System.out.printf("\nImporte a pagar: %.2f €.",  preciofinal);
			}
			break;
		default:
			System.out.println("El número introducido no es válido.");
			System.exit(0);
		}
		input.close();
	}
}
