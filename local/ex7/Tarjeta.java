package local.ex7;
import java.text.DecimalFormat;

public class Tarjeta {
    // ATRIBUTOS
    private String numero;
    private double saldo;
    // CONSTRUCTOR
    public Tarjeta (double saldo) {
        this.numero = "";
        for (int i=0; i<5; i++) {
            this.numero += (int) (Math.random()*10);
        }
        this.saldo = saldo;
    }
    public Tarjeta (Tarjeta tarjeta1, Tarjeta tarjeta2) {
        this.numero = "";
        for (int i=0; i<5; i++) {
            this.numero += (int) (Math.random()*10);
        }
        this.saldo = tarjeta1.getSaldo()+tarjeta2.getSaldo();
        tarjeta1.setSaldo(0);
        tarjeta2.setSaldo(0);
    }
    // GETTER
    public double getSaldo() {
        return saldo;
    }
    public String getNumero() {
        return numero;
    }
    // SETTER
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setNumero() {
        this.numero = "";
        for (int i=0; i<5; i++) {
            this.numero += (int) (Math.random()*10);
        }
    }
    // TO STRING
    @Override
    public String toString() {
        DecimalFormat formatEuros = new DecimalFormat("0.00€");
        return "El saldo de la tarjeta " + this.getNumero() + " es " + formatEuros.format(this.getSaldo());
    }
    // METHODS
    public void pagar(double pago) {
        DecimalFormat formatEuros = new DecimalFormat("0.00€");
        if (this.getSaldo()<pago) {
            System.out.println("El saldo de la tarjeta " + this.getNumero() + " no es suficiente.");
        } else if (pago>0) {
            this.saldo-=pago;
            System.out.println("Tu nuevo saldo es " + formatEuros.format(this.getSaldo()));
        } else {
            System.out.println("No se pueden realizar pagos negativos");
        }
    }
    public void recargar(double recarga) {
        DecimalFormat formatEuros = new DecimalFormat("0.00€");
        if (recarga>0) {
            this.saldo+=recarga;
            System.out.println("Tu nuevo saldo es " + formatEuros.format(this.getSaldo()));
        } else {
            System.out.println("No se pueden realizar recargas negativos");
        }
    }
}
