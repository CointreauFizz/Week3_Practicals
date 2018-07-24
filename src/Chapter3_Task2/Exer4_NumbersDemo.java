package Chapter3_Task2;

public class Exer4_NumbersDemo {

        public static void main (String args[])
        {
            int num1 = 4, num2 = 33;
            displayTwiceTheNumber(num1);
            displayNumberPlusFive(num1);
            displayNumberSquared(num1);
            displayTwiceTheNumber(num2);
            displayNumberPlusFive(num2);
            displayNumberSquared(num2);
        }
        private static void displayTwiceTheNumber(int n)
        {
            final int FACTOR = 2;
            System.out.println(n + " times " + FACTOR + " is " + (n * FACTOR));
        }
        private static void displayNumberPlusFive(int n)
        {
            final int FACTOR = 5;
            System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR));
        }
        private static void displayNumberSquared(int n)
        {
            System.out.println(n + " squared is " + (n * n));
        }
    }