package org.example;

public class Main {
    public static void main(String[] args) {
        //creating an account
        Atm atm= new Atm();
        Account shrey=atm.createAccount("Shrey",2003);
        Account mahi=atm.createAccount("Mahi",2004);

        //Checking account balance
        atm.checkBalance(shrey,2003);

        //Deposit Money
        atm.depositBalance(shrey,2003,5000);

        //Withdraw Money
        atm.withdrawBalance(shrey,2003,100);

        //Check balance again
        atm.checkBalance(shrey,2003);



        
    }
}