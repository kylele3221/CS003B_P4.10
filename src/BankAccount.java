public class BankAccount
{
    private static final double ANNUAL_INTEREST_RATE = 6.0;

    private double balance;

    public BankAccount()
    {
        this.balance = 0.0;
    }

    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    public void calculateNewBalance()
    {
        this.balance += (this.balance * ((ANNUAL_INTEREST_RATE / 100) / 12));
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void output()
    {
        System.out.printf("Initial balance: %.2f\n", this.balance);
        System.out.printf("Annual Interest Rate: %.2f\n", ANNUAL_INTEREST_RATE);

        calculateNewBalance();
        System.out.printf("After first month: %11.2f\n", this.balance);

        calculateNewBalance();
        System.out.printf("After second month: %10.2f\n", this.balance);

        calculateNewBalance();
        System.out.printf("After third month: %11.2f\n", this.balance);
    }
}
