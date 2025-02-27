package org.example;

public class Atm {
        Account account;



    public void checkBalance(Account account,int pin)
    {
        this.account=account;
        if(pin==account.getPin())
            System.out.println(account.getBalance());
        else
            System.out.println(
                    "Incorrect account or pin!"
            );
    }

    public void withdrawBalance(Account account,int pin,int amount)
    {
        this.account=account;
        if(pin==account.getPin() && amount<account.getBalance() )
        {
            account.setBalance(account.getBalance()-amount);
            System.out.println("Withdrawal of "+ amount + " successful");
        }
        else System.out.println("Incorrect pin or Wrong Amount");
    }

    public void depositBalance(Account account,int pin,int amount)
    {
        this.account=account;
        if(pin==account.getPin()  )
        {
            account.setBalance(account.getBalance()+amount);
            System.out.println("Balance deposited: "+amount);
        }
        else System.out.println("Incorrect pin or Wrong Amount");
    }

    public Account createAccount(String name,int pin)
    {

       account= new Account(name,pin);
        System.out.println("Hello "+ name+ " your account has been created");
        return account;
    }

}
