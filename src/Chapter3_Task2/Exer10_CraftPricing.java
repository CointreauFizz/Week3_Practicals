package Chapter3_Task2;

import java.util.Scanner;
public class Exer10_CraftPricing {
 public static void main(String[] args)
    {
        String product;
        double materials;
        double hours;
        double price;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter product descriptpon >> ");
        product = input.nextLine();
        System.out.print("Enter cost of materials >> ");
        materials = input.nextDouble();
        System.out.print("Enter hours of work >> ");
        hours = input.nextDouble();
        price = computePrice(materials, hours);
        System.out.println("The price fr product " + product +
                " is $" + price);
    }

    private static double computePrice(double materials, double hours)
    {
        double price;
        final double RATE = 12.00;
        final double S_AND_H = 7.00;
        price = materials + hours * RATE + S_AND_H;
        return price;
    }
}