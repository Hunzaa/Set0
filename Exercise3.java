import javax.swing.*;

public class Exercise3 {
    public static void main(String[] args) {


        String name, grossIncomeAsString;
        double grossIncome, tax, netIncome;
        float taxRate;

        name = JOptionPane.showInputDialog("Please enter your name: ");

        grossIncomeAsString = JOptionPane.showInputDialog("Please enter your taxable income: ");
        grossIncome = Double.parseDouble(grossIncomeAsString);


        if (grossIncome > 0 && grossIncome <= 20000) {
            taxRate = 0;
            tax = 0;
            netIncome = grossIncome * 1;
        }

        else if (grossIncome > 20000 && grossIncome <= 36000) {
            taxRate = 20;
            tax = grossIncome * 0.2;
            netIncome = grossIncome - tax;
        }

        else {
            taxRate = 41;
            tax = grossIncome * 0.41;
            netIncome = grossIncome - tax;
        }


        JOptionPane.showMessageDialog(null, "Name: " + name + "\nGross Income: " + grossIncome + " \u20AC \nTax Rate: " + taxRate + " %\nTax: " + tax + " \u20AC \nNet Income : " + netIncome + " \u20AC",
                "Information", JOptionPane.INFORMATION_MESSAGE);

    }
}
