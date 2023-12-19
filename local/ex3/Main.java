package local.ex3;

public class Main {
    public static void main(String[] args) {
        Tiempo hora1 = new Tiempo(3,50,49);
        System.out.println(hora1);
        Tiempo hora2 = new Tiempo(6,42,36);
        System.out.println(hora2);
        Tiempo resultado = new Tiempo(0);
        resultado.sumarHoras(hora1,hora2);
        System.out.println(resultado);
        resultado.restarHoras(hora1,hora2);
        System.out.println(resultado);
    }
}
