public class BankSimulator {
    private String name;
    private String cedula;
    private int currentMonth;

    private CurrentAccount currentAccount;
    private SavingAccount savingAccount;
    private CDT cdt;

    public void depositCurrentAccount(double amount)
    {
        currentAccount.addAmount(amount);
    }

    public double getTotalAmount()
    {
        return currentAccount.showAmount() + savingAccount.showAmount() + cdt.getCurrentAmount(currentMonth);
    }

    public void moveSavingsToCurrent()
    {
        double temp = savingAccount.showAmount();

        savingAccount.getAmount(temp);
    }
}