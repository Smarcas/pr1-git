package local.ex6;

public class Programa2 {
    public static void main(String[] args) {
        Smartphone movil1 = new Smartphone(644567189, "barata");
        Smartphone movil2 = new Smartphone(612345678, "cara");
        Smartphone movil3 = new Smartphone(657428954, "normal");
        Smartphone movil4 = new Smartphone(711438920, "cara");
        System.out.println(movil1);
        System.out.println(movil2);
        movil1.llamar(movil2, 320);
        movil2.llamar(movil3, 500);
        movil4.llamar(movil2, 50);
        System.out.println(movil1);
        System.out.println(movil2);
        System.out.println(movil3);
        System.out.println(movil4);
        System.out.println("El número de segundos totales es " + Telefono.getSegundosTotales() + ".");
    }
}
