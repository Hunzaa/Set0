import javax.swing.*;

public class Exercise1 {
    public static void main(String[] args) {

        String name, className, snacksAsString;
        int snacks, pricePerSnack = 2, total = 0;

        name = JOptionPane.showInputDialog("Please enter your name");

        className = JOptionPane.showInputDialog("Please enter your class name");

        snacksAsString = JOptionPane.showInputDialog("Please enter the amount of snacks you'd like");
        snacks = Integer.parseInt(snacksAsString);

        total = snacks * pricePerSnack;

        JOptionPane.showMessageDialog(null, "Name: " + name + "\nClass: " + className + "\nNo. of Snacks: " + snacks + "\nTotal Price: " + total,
                "Information", JOptionPane.INFORMATION_MESSAGE);

    }
}


