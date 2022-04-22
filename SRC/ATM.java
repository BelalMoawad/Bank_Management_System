package org.paumard.lambdas;

public class ATM {
    private int managedBy;
    private String location;

    public ATM(int managedBy , String location) {
        this.managedBy = managedBy;
        this.location = location;
    }

    public void showActBalance(bankAcount bankAccount) {
        System.out.println(bankAccount.getAccountBalance());
    }

}
