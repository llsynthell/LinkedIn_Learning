import java.awt.*;
import java.lang.Math;
import java.util.Random;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount(4141, 100);

        System.out.println();

        myBankAccount.deposit(-60);
        myBankAccount.withdraw(150);

        myBankAccount.deposit(100);
        myBankAccount.withdraw(200);
    }
}