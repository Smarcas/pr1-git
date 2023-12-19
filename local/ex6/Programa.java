package local.ex6;

public class Programa {
    public static void main(String[] args) {
        Telefono telefono1 = new Telefono(644567189);
        Telefono telefono2 = new Telefono(612345678);
        Telefono telefono3 = new Telefono(657428954);
        Telefono telefono4 = new Telefono(711438920);
        System.out.println(telefono1);
        System.out.println(telefono2);
        telefono1.llamar(telefono2, 320);
        telefono2.llamar(telefono3, 500);
        telefono4.llamar(telefono2, 50);
        System.out.println(telefono1);
        System.out.println(telefono2);
        System.out.println(telefono3);
        System.out.println(telefono4);
        System.out.println("El número de segundos totales es " + Telefono.getSegundosTotales() + ".");
    }
}
