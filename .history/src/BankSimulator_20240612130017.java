public class BankSimulator {
    private String name;
    private String cedula;
    private int currentMonth;

    private CurrentAccount currentAccount;
    private SavingAccount savingAccount;
    private CDT cdt;

    public void depositCurrentAccount(double amount)
    {
        currentAccount = amount;
    }
}