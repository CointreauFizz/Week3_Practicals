package Chapter3_Task2;

import java.util.Scanner;

public class Exer9_Insurance {
        public static void main (String args[])
        {
            int currYear;
            int birthYear;
            int premium;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the current year >> ");
            currYear = input.nextInt();
            System.out.print("Enter the birth year >> ");
            birthYear = input.nextInt();
            premium = calculatePremium(currYear, birthYear);
            System.out.println("The premium is $" + premium);
        }

        private static int calculatePremium(int curr, int birth)
        {
            final int ADDITION_FACTOR = 15;
            final int MULTIPLICATION_FACTOR;
            MULTIPLICATION_FACTOR = 20;
            int age = curr - birth;
            int decade = age / 10;
            return (ADDITION_FACTOR + decade) * MULTIPLICATION_FACTOR;
        }
    }