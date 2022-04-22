package org.paumard.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private int code;
    private List<Branch> branchList;
    private List<bankAcount> bankAcountList;
    Branch branch;
    public Bank (String bankName , int bankCode , String branchAddress , int branchCode) {
        branch = new Branch(branchCode , branchAddress);
        branchList = new ArrayList<>();
        bankAcountList = new ArrayList<>();
        addBranch(branch);
        name = bankName;
        code = bankCode;
    }

    public void addBranch(Branch branch) {
        branchList.add(branch);
    }

    public void removeBranch(Branch branch) {
        branchList.remove(branch);
    }

    public void addBankAccount(bankAcount BankAccount) {
        bankAcountList.add(BankAccount);
    }

    public  void removeBankAccount(bankAcount BankAccount) {
        bankAcountList.remove(BankAccount);
    }

    public class Branch {
        private int branchCode;
        private String address;
        private List<ATM> ATMList;
        public Branch(int branchCode , String address) {
            ATMList = new ArrayList<>();
            this.branchCode = branchCode;
            this.address = address;
        }

        public void addATM(ATM atm) {
            ATMList.add(atm);
        }

        public void removeATM(ATM atm) {
            ATMList.remove(atm);
        }
    }
}
