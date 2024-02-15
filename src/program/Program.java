package program;

import models.entities.Account;
import models.exceptions.DomainExceptions;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Account account = new Account();
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();

            System.out.print("Holder: ");
            String holder = sc.next();

            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdraw = sc.nextDouble();

            System.out.print("Enter amount for withdraw: ");
            double limit = sc.nextDouble();
            account = new Account(number, holder, balance, withdraw);

            account.withdraw(limit);

            System.out.println(account.toString());


            sc.close();
        } catch (DomainExceptions e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } finally {

        }
        ;




    }
}
