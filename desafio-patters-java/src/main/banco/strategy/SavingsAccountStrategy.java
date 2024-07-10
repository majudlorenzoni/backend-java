package main.banco.strategy;

public class SavingsAccountStrategy implements InterestStrategy {
  @Override
  public double calculateInterest(double balance) {
      return balance * 0.03; // 3% interest rate
  }
}