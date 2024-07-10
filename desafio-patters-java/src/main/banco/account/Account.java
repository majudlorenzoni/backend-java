package main.banco.account;

public abstract class Account {
  protected String accountNumber;
  protected double balance;

  public Account(String accountNumber) {
      this.accountNumber = accountNumber;
      this.balance = 0.0;
  }

  public String getAccountNumber() {
      return accountNumber;
  }

  public double getBalance() {
      return balance;
  }

  public void deposit(double amount) {
      if (amount > 0) {
          balance += amount;
      }
  }

  public abstract void withdraw(double amount);
}