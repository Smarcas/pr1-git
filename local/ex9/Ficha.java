package local.ex9;

public class Ficha {
    // ATRIBUTOS
    private int lado1;
    private int lado2;
    // CONSTRUCTOR
    public Ficha() {
        lado1 = Ficha.valorFicha();
        lado2 = Ficha.valorFicha();
    }
    // GETTER AND SETTER
    public int getLado1() {
        return lado1;
    }
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    public int getLado2() {
        return lado2;
    }
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    // TO STRING
    public String toString() {
        return "| " + this.lado1 + " | " + this.lado2 + " |";
    }
    // METHODS
    public boolean encajarFicha(Ficha f1) {
        if (this.lado1==f1.lado1 || this.lado2==f1.lado2) {
            return true;
        } else {
            return false;
        }
    }
    public void rotarFicha() {
        int temporal = this.lado1;
        this.lado1=this.lado2;
        this.lado2=temporal;
    }
    public static int valorFicha() {
        int n;
        n = (int) (Math.random() * 7);
        return n;
    }
}

