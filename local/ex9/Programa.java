package local.ex9;

public class Programa {
    public static void main(String[] args) {
        Ficha ficha1 = new Ficha();
        Ficha ficha2 = new Ficha();
        Ficha ficha3 = new Ficha();
        System.out.println(ficha1);
        System.out.println(ficha2);
        System.out.println(ficha3);
        System.out.println("Probemos a encajar la primera ficha con la segunda: ");
        if (ficha1.encajarFicha(ficha2)) {
            System.out.println("Genial, las fichas " + ficha1 + " y " + ficha2 + " encajan");
        } else {
            System.out.println("Las fichas no encajan, probemos de nuevo rotándola.");
        }
        ficha2.rotarFicha();
        if (ficha1.encajarFicha(ficha2)) {
            System.out.println("Genial, las fichas " + ficha1 + " y " + ficha2 + " encajan");
        } else {
            System.out.println("Las fichas no encajan.");
        }
        System.out.println("\nProbemos a encajar la primera ficha con la tercera: ");
        if (ficha1.encajarFicha(ficha3)) {
            System.out.println("Genial, las fichas " + ficha1 + " y " + ficha3 + " encajan");
        } else {
            System.out.println("Las fichas no encajan, probemos de nuevo rotándola.");
        }
        ficha3.rotarFicha();
        if (ficha1.encajarFicha(ficha3)) {
            System.out.println("Genial, las fichas " + ficha1 + " y " + ficha3 + " encajan");
        } else {
            System.out.println("Las fichas no encajan.");
        }
    }
}
