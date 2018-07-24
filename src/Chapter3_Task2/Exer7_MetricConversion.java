package Chapter3_Task2;

import javax.swing.JOptionPane;

public class Exer7_MetricConversion {

    public static void main (String[] args)
    {
        String inputNumber;
        int number;

        inputNumber = JOptionPane.showInputDialog(null,"Enter an integer:");
        number = Integer.parseInt(inputNumber);

        convertToCm(number);
        convertToLiters(number);
    }

    private static void convertToCm(int num)
    {
        final double TO_CM = 2.54;
        JOptionPane.showMessageDialog(null,num + " Inches is " + num *TO_CM +
                " Centimeters.");
    }

    private static void convertToLiters(int num)
    {
        final double TO_LITERS = 3.7854;
        JOptionPane.showMessageDialog(null,num + " Gallon is " + num *TO_LITERS +
                " Liters.");

    }

}
