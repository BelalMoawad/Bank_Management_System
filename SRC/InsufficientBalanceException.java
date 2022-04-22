package org.paumard.lambdas;

public class InsufficientBalanceException extends Exception{
    public String toString() {
        return "Balance not sufficient";
    }
}
