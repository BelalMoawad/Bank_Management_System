package org.paumard.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class bankAcount {
    private int accountNumber, accountBalance;
    private String customerName;
    private List<Transaction> actTransactionList;

    public bankAcount(int accountNumber , int accountBalance , String customerName) {
        actTransactionList = new ArrayList<>();
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit(int depositAmount) {
        Random r = new Random();
        accountBalance += depositAmount;
        Transaction transaction = new Transaction(r.nextInt() , accountNumber , depositAmount ,
                                                    accountBalance , "deposit");
        actTransactionList.add(transaction);
        TransactionDetails.addTransaction(transaction);
    }

    public void withdraw(int withdrawAmount)  {
        Random r = new Random();
        boolean flag = true;
        if(withdrawAmount > accountBalance) {
            try {
                throw new InsufficientBalanceException();
            } catch (InsufficientBalanceException e) {
                System.out.println(e.toString());
                flag = false;
            }
        }
        if(flag) accountBalance -= withdrawAmount;
        Transaction transaction = new Transaction(r.nextInt() , accountNumber , withdrawAmount ,
                accountBalance , "withdraw");
        actTransactionList.add(transaction);
        TransactionDetails.addTransaction(transaction);
    }

    public void showActTransaction() {
        int sz = actTransactionList.size();
        for (int i = 0 ; i < sz ; i++) {
            Transaction t = actTransactionList.get(i);
            System.out.println( t.getActNumber() + " " + t.getTranType() + " " + t.getTranAmount() + " " + t.getTranNumber() + " " + t.getBalanceAfterThisTransaction());
        }
    }

}
