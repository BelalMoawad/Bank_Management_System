package org.paumard.lambdas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // bank name , bank code , first branch address , branch code
        Bank bank = new Bank("Al-Ahly" , 123 , "233 cairo", 22);

        bankAcount belal = new bankAcount(1 , 1000 , "belal");
        belal.deposit(2000);
        belal.withdraw(1000);
        belal.withdraw(2500);
        ////
        bankAcount ahmed = new bankAcount(2 , 10000 , "ahmed");
        ahmed.deposit(3000);
        ahmed.withdraw(1000);
        ahmed.withdraw(10000);
        ////
        bankAcount ali = new bankAcount(3 , 5000 , "ali");
        ali.deposit(5646);
        ali.withdraw(3454);
        ali.withdraw(10000);

        bank.addBankAccount(belal);
        bank.addBankAccount(ahmed);
        bank.addBankAccount(ali);

        // print all transactions
        TransactionDetails.showAllTransactions();

        System.out.println();

        // print belal transactions
        belal.showActTransaction();
    }
}
