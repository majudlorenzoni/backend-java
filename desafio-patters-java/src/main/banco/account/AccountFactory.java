package main.banco.account;

public class AccountFactory {
  public static Account createAccount(AccountType type, String accountNumber) {
      switch (type) {
          case SAVINGS:
              return new SavingsAccount(accountNumber);
          case CURRENT:
              return new CurrentAccount(accountNumber);
          default:
              throw new IllegalArgumentException("Unknown account type");
      }
  }
}