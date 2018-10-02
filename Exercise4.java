import javax.swing.*;

public class Exercise4 {
    public static void main(String[] args) {

        String numberAsString;
        float number = 0, noOfEntries = 0, grandTotal = 0;

        numberAsString = JOptionPane.showInputDialog("Please enter a number: ");

        while (!numberAsString.equals("q"))
        {
            number = Float.parseFloat(numberAsString);

            noOfEntries++;
            grandTotal += number;

            numberAsString = JOptionPane.showInputDialog("Please enter a number: ");
        }

        JOptionPane.showMessageDialog(null, "Number of Entries: " + noOfEntries + "\nGrand Total: " + grandTotal,
                                      "Information", JOptionPane.INFORMATION_MESSAGE);

    }
}
