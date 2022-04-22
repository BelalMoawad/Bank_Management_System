package org.paumard.lambdas;
import java.util.ArrayList;
import java.util.List;

public class TransactionDetails {
    public static List<Transaction> transactionList = new ArrayList<>();
    public static void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    public static void showAllTransactions() {
        System.out.println("all transactionList :");
        int sz = transactionList.size();
        for (int i = 0 ; i < sz ; i++) {
            Transaction t = transactionList.get(i);
            System.out.println( t.getActNumber() + " " + t.getTranType() + " " + t.getTranAmount() + " " + t.getTranNumber() + " " + t.getBalanceAfterThisTransaction());
        }
    }

}
