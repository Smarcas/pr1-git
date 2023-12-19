package local.ex3;

public class Tiempo {
    /// ATTRIBUTES
    private int segundos;
    private boolean horavalida=false;

    /// METHODS
    /// CONSTRUCTOR
    Tiempo (int hora, int minutos, int segundos) {
        if (hora<0 || hora>23 || minutos<0 || minutos>59 || segundos<0 || segundos>59) {
        } else {
            this.horavalida=true;
        }
        this.segundos = (hora*3600) + (minutos*60) + segundos;
    }
    Tiempo (int segundos) {
        this.segundos = segundos;
    }
    /// GETTER
    public int getSegundos() {
        return this.segundos;
    }
    public boolean isHoravalida() {
        return this.horavalida;
    }
    /// SETTER
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    public void setHoravalida(boolean horavalida) {
        this.horavalida = horavalida;
    }
    /// TO STRING
    @Override
    public String toString() {
        int temporal = 0;
        int horas = this.getSegundos() / 3600;
        int minutos = (this.getSegundos() - (horas * 3600)) / 60;
        int segundosfinal = this.getSegundos() - horas * 3600 - minutos * 60;
        if (segundos<0) {
            return "-(" + -horas + ":" + -minutos + ":" + -segundosfinal + ")";
        } else {
            return horas + ":" + minutos + ":" + segundosfinal;
        }
    }
    /// OTROS
    public void sumarHoras(Tiempo hora1, Tiempo hora2) {
        boolean validacion1 = hora1.isHoravalida();
        boolean validacion2 = hora2.isHoravalida();
        if (validacion1==false || validacion2==false) {
            System.out.print("Alguna de las horas introducidas no es válida.");
        } else {
            this.setSegundos(hora1.getSegundos()+hora2.getSegundos());
        }
    }
    public void restarHoras(Tiempo hora1, Tiempo hora2) {
        boolean validacion1 = hora1.isHoravalida();
        boolean validacion2 = hora2.isHoravalida();
        if (validacion1==false || validacion2==false) {
            System.out.print("Alguna de las horas introducidas no es válida.");
        } else {
            this.setSegundos(hora1.getSegundos()-hora2.getSegundos());
        }
    }
}
