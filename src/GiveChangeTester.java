import javax.swing.*;
import java.util.Scanner;


public class GiveChangeTester {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter amount due:");
        int amountDue = Integer.parseInt(input);
        String input1 = JOptionPane.showInputDialog("Enter amount given:");
        int amountGiven = Integer.parseInt(input1);
        GiveChange change = new GiveChange(amountDue, amountGiven);
        JOptionPane.showMessageDialog(null, change.calculateChange());
    }
}