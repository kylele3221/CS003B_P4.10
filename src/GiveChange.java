public class GiveChange {
    private int amountOwed;
    private int dollar, quarter, dime, nickel, penny;
    /**
     Constructor to create a GiveChange object.
     @param amountDue amount that needs to be paid
     @param amountGiven amount of change that was given
     */
    public GiveChange(int amountDue, int amountGiven)
    {
        amountOwed = amountGiven - amountDue;
    }
    /**
     Method to calculate and return the amount of change that needs to be given
     @param change
     @return int for how much change is left
     */
    public int dollar(int change)
    {
        dollar = change / 100;
        return change % 100;
    }

/**
 Method to calculate and return the amount of change that needs to be given
 @param change
 @return int for how much change is left
 */
public int quarter(int change)
    {
        quarter = change / 25;
        return change % 25;
    }
/**
 Method to calculate and return the amount of change that needs to be given
 @param change
 @return int for how much change is left
 */
public int dime(int change)
    {
        dime = change / 10;
        return change % 10;
    }
/**
 Method to calculate and return the amount of change that needs to be given
 @param change
 @return int for how much change is left
 */
public int nickel(int change)
    {
        nickel = change / 5;
        return change % 5;
    }
/**
 Method to calculate and return the amount of change that needs to be given
 @param change
 @return int for how much change is left
 */
public int penny(int change)
    {
        penny = change;
        return change;
    }
/**
 Method to calculate and return the amount of change that needs to be given
 @return int for how much change is left
 */

    /**
     Method to calculate and return the amount of change that needs to be given
     */
    public String calculateChange()
    {
        String returnString = "";
        penny(nickel(dime(quarter(dollar(amountOwed)))));
        if (dollar > 0)
        {
            returnString += "Dollar(s): " + dollar;
        }
        if (quarter > 0)
        {
            returnString += "\nQuarter(s): " + quarter;
        }
        if (dime > 0)
        {
            returnString += "\nDime(s): " + dime;
        }
        if (nickel > 0)
        {
            returnString += "\nNickle(s): " + nickel;
        }
        if (penny > 0)
        {
            returnString += "\nPennie(s): " + penny;
        }
        return returnString;
    }
}
