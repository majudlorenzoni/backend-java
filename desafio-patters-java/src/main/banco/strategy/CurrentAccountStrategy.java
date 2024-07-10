
public class CurrentAccountStrategy implements InterestStrategy {
  @Override
  public double calculateInterest(double balance) {
      return balance * 0.01; // 1% interest rate
  }
}
