package Objetos;

public class Caballo {
    /// atributos ///
    String sex, breed, mane, color;
    double weight, height;

    /// methods ///
    /// constructor ///
    Caballo (String sex, String breed) {
        if (sex.equals("macho") || sex.equals("hembra")) {
            this.sex = sex;
        } else {
            System.out.println("El sexo del caballo tiene que ser macho o hembra.");
        }
        this.breed = breed;
    }

    /// getter
    String getSex() {
        return this.sex;
    }
    double getWeight() {
        return this.weight;
    }

    /// métodos comunes
    void trota() {
        System.out.println("tucutú, tucutú");
    }
    void relincha() {
        System.out.println("¡hiiii, hiiii, hiiii!");
    }
    void come() {
        System.out.println("¡ñam!");
    }
    void compite(Caballo caballo) {
        if (this.sex.equals(caballo.getSex())) {
            System.out.print("Ganaré yo");
            if (0 == 0) {
                System.out.print("Oh no, soy más lento que tú, he perdido.");
            } else {
                System.out.print("JAJA, gané, soy más rápido.");
            }
        } else {
            System.out.print("Lo siento, me he enamorado, no puedo competir.");
        }
    }
}
