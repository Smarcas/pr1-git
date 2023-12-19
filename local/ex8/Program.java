package local.ex8;

public class Program {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(500);
        BankAccount b2 = new BankAccount();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("\nTransferimos de la primera cuenta a la segunda 200,10€.");
        b1.transfer(b2, 200.10);
        System.out.println("\nPagamos 300.56€ con la segunda cuenta.");
        b2.charge(300.56);
        System.out.println("\nFinalmente, metemos 100€ con la primera cuenta.");
        b1.deposit(100);
    }
}
