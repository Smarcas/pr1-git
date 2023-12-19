package local.ex6;

import java.text.DecimalFormat;

public class Smartphone extends Telefono {
    // ATRIBUTOS
    private String tarifa;
    private int segundostarificados;
    private double totalpagar;
    // CONSTRUCTOR
    public Smartphone (int numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
        this.segundostarificados = 0;
    }
    // GETTER
    public String getTarifa() {
        return tarifa;
    }
    // SETTER
    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }
    // TO STRING
    @Override
    public String toString() {
        DecimalFormat formatEuros = new DecimalFormat("0.00");
        return "Nº: " + this.getNumero() + " ha llamado durante " + this.getSegundos()
                + " segundos - Tarificados: " + String.format("%.2f", totalpagar) + "€.";
    }
    // METHODS
    public void llamar(Smartphone movil1, int segundos) {
        super.llamar(movil1, segundos);
        double minutos = 0;
        switch (tarifa) {
            case "barata":
                minutos = (double) (segundos/60);
                this.totalpagar+= minutos*0.06;
                break;
            case "normal":
                minutos = (double) segundos/60;
                this.totalpagar+=(double) minutos*0.12;
                break;
            case "cara":
                minutos = (double) segundos/60;
                this.totalpagar+=(double) minutos*0.30;
                break;
        }
    }
}
