import javax.swing.*;

public class Exercise6 {
    public static void main(String[] args) {

        String choice, numberAsString, number2AsString;
        float number, number2, addition, subtraction, multiplication, division;

        choice = JOptionPane.showInputDialog("A - Addition\nS - Subtraction\nM - Multiplication\nD - Division \n\nEnter your choice: ");

        switch(choice)
        {
            case "A":
                numberAsString = JOptionPane.showInputDialog("Please enter a number: ");
                number = Float.parseFloat(numberAsString);
                number2AsString = JOptionPane.showInputDialog("Please enter another number: ");
                number2 = Float.parseFloat(number2AsString);

                addition = number + number2;

                JOptionPane.showMessageDialog(null,"Answer: " + addition,"Result",JOptionPane.INFORMATION_MESSAGE);
                break;

            case "S":
                numberAsString = JOptionPane.showInputDialog("Please enter a number: ");
                number = Float.parseFloat(numberAsString);
                number2AsString = JOptionPane.showInputDialog("Please enter another number: ");
                number2 = Float.parseFloat(number2AsString);

                subtraction = number - number2;

                JOptionPane.showMessageDialog(null,"Answer: " + subtraction,"Result",JOptionPane.INFORMATION_MESSAGE);
                break;

            case "M":
                numberAsString = JOptionPane.showInputDialog("Please enter a number: ");
                number = Float.parseFloat(numberAsString);
                number2AsString = JOptionPane.showInputDialog("Please enter another number: ");
                number2 = Float.parseFloat(number2AsString);

                multiplication = number * number2;

                JOptionPane.showMessageDialog(null,"Answer: " + multiplication,"Result",JOptionPane.INFORMATION_MESSAGE);
                break;

            case "D":
                numberAsString = JOptionPane.showInputDialog("Please enter a number: ");
                number = Float.parseFloat(numberAsString);
                number2AsString = JOptionPane.showInputDialog("Please enter another number: ");
                number2 = Float.parseFloat(number2AsString);

                division = number / number2;

                JOptionPane.showMessageDialog(null,"Answer: " + division,"Result",JOptionPane.INFORMATION_MESSAGE);
                break;


        }
        while(!choice.equals("Q"));

        //JOptionPane.showMessageDialog(null,"Goodbye","Exit", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showConfirmDialog(null,"Quit", "Exit", JOptionPane.YES_NO_OPTION);



    }


}
