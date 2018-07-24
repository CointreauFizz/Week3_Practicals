package Chapter3_Task2;

import java.util.Scanner;
public class Exer8_PaintCalculator {

    public static void main (String args[])
        {
            double length, width, height;
            double price;
            Scanner kb = new Scanner(System.in);
            System.out.print("Enter the room's length >> ");
            length = kb.nextDouble();
            System.out.print("Enter the room's width >> ");
            width = kb.nextDouble();
            System.out.print("Enter the room's height >> ");
            height = kb.nextDouble();
            price = computeArea(length, width, height);
            System.out.println("The price to paint the room is $" + price);
        }

        private static double computeArea(double length, double width, double height)
        {
            final double PRICE_GALLON = 32;
            double area = length * height * 2 + width * height * 2;
            double price;
            double gallons;
            gallons = computeGallons(area);
            System.out.println("You will need " + gallons + " gallons");
            price = gallons * PRICE_GALLON;
            return price;
        }
        private static double computeGallons(double area)
        {
            final int SQFT_PER_GAL = 350;
            return SQFT_PER_GAL / area;
        }
    }
