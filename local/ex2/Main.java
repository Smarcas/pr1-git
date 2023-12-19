package local.ex2;

public class Main {
    public static void main(String[] args) {
        // TODO hacer una simulación de 3 pizzas y jugar con el estado de pedida o servida
        Pizza pizza1 = new Pizza("mediana", "margarita");
        Pizza pizza2 = new Pizza("familiar", "funghi");
        Pizza pizza3 = new Pizza("mediana", "4 quesos");
        System.out.println(pizza1);
        pizza2.servirPizza();
        System.out.println(pizza2);
        System.out.println(pizza3);
        System.out.println(pizza2);
        pizza2.servirPizza();
        System.out.println("Número de pizzas pedidas: " + Pizza.getPizzaspedidas());
        System.out.println("Número de pizzas servidas: " + Pizza.getPizzasservidas());
    }
}
