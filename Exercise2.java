import javax.swing.*;

public class Exercise2 {
    public static void main(String[] args) {

        String firstName, initial, lastName, distanceAsString;
        float distance, moneyDue =0;

        firstName = JOptionPane.showInputDialog("Please enter your first name ");

        initial = JOptionPane.showInputDialog("Please enter your initials ");

        lastName = JOptionPane.showInputDialog("Please enter your last name ");

        distanceAsString = JOptionPane.showInputDialog("Please enter the distance cycled ");
        distance = Float.parseFloat(distanceAsString);

        if (distance < 10) {
            moneyDue = distance * 7;
        }
        else
        {
            moneyDue = ( (distance - 10) * 10 ) + 70;
        }


        JOptionPane.showMessageDialog(null, "Full Name: " + firstName + " " + initial + " " + lastName +
                        "\nDistance Cycled: " + distance + "\nMoney Due: " + moneyDue,
                "Information", JOptionPane.INFORMATION_MESSAGE);


    }
}
