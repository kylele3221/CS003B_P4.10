/**
 * Class that handles a Bank Account balance and returns the amount of interest accumulated over three months.
 */
public class BankAccountTester
{
    public static void main (String[] args)
    {
        BankAccount b1 = new BankAccount(34597);
        b1.output();
    }
}

/*
 * Sample Output
 * Initial balance: 34597.00
 * Annual Interest Rate: 6.00
 * After first month:    34769.99
 * After second month:   34943.83
 * After third month:    35118.55
 */