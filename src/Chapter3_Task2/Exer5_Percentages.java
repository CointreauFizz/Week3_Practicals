package Chapter3_Task2;

public class Exer5_Percentages {

        public static void main (String args[])
        {
            double num1 = 2.0, num2 = 5.0;
            computePercent(num1, num2);
            computePercent(num2, num1);
        }
        private static void computePercent(double x, double y)
        {
            System.out.println(x + " is " + (x / y) * 100 + " percent of " + y);
        }
    }