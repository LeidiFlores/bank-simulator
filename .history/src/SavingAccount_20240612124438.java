public class SavingAccount {
    private double totalAmount;
    private double interests;

    public void addAmount(double value)
    {
        totalAmount += value;
    }

    public double showAmount()
    {
        return totalAmount;
    }

    public void getAmount(int value)
    {
        totalAmount -= value;
    }
}
