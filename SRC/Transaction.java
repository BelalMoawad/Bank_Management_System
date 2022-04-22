package org.paumard.lambdas;

public class Transaction {
    private int tranNumber , actNumber , tranAmount , balanceAfterThisTransaction;
    private String tranType;

    public Transaction() {
    }

    public Transaction(int tranNumber , int actNumber , int tranAmount , int balanceAfterThisTransaction , String tranType) {
        this.tranNumber = tranNumber;
        this.actNumber = actNumber;
        this.tranAmount = tranAmount;
        this.balanceAfterThisTransaction = balanceAfterThisTransaction;
        this.tranType = tranType;
    }

    public int getTranNumber() {
        return tranNumber;
    }

    public void setTranNumber(int tranNumber) {
        this.tranNumber = tranNumber;
    }

    public int getActNumber() {
        return actNumber;
    }

    public void setActNumber(int actNumber) {
        this.actNumber = actNumber;
    }

    public int getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(int tranAmount) {
        this.tranAmount = tranAmount;
    }

    public int getBalanceAfterThisTransaction() {
        return balanceAfterThisTransaction;
    }

    public void setBalanceAfterThisTransaction(int balanceAfterThisTransaction) {
        this.balanceAfterThisTransaction = balanceAfterThisTransaction;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

}
