package local.ex8;
import java.text.DecimalFormat;

public class BankAccount {
    //TODO EJERCICIO 8: Cada cuenta = IBAN 10 dígitos y saldo (iniciado o 0€). Métodos = ingreso, cargo y transferencia.
    DecimalFormat formatEuros = new DecimalFormat("#0.00€");
    // ATRIBUTOS
    private String iban;
    private double balance;
    // CONSTRUCTORES
    public BankAccount () {
        this.balance = 0;
        this.iban = "";
        for (int cont=0; cont<10; cont++) {
            this.iban += (int) (Math.random()*10);
        }
    }
    public BankAccount (double money) {
        this.balance = money;
        this.iban = "";
        for (int cont=0; cont<10; cont++) {
            this.iban += (int) (Math.random()*10);
        }
    }
    // GETTER AND SETTER
    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    // TO STRING

    // METHODS
    public void deposit(double money) {
        this.balance+=money;
        System.out.println("The new balance for " + this.getIban() + " is " + formatEuros.format(this.getBalance()));
    }
    public void charge(double money) {
        this.balance-=money;
        System.out.println("The new balance for " + this.getIban() + " is " + formatEuros.format(this.getBalance()));
    }
    public void transfer(BankAccount b1, double money) {
        if (money>0) {
            this.balance-=money;
            b1.balance+=money;
            System.out.println("The new balance for " + this.getIban() + " is " + formatEuros.format(this.getBalance()));
            System.out.println("The new balance for " + b1.getIban() + " is " + formatEuros.format(b1.getBalance()));
        } else {
            System.out.println("You must use positive numbers.");
        }
    }
}
