public class SavingAccount {
    private double totalAmount;
    private double interests;

    public void addAmount (double value)
    {
        totalAmount += value;
    }

    public double getAmount()
    {
        return totalAmount;
    }
}
