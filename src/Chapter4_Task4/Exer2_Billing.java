package Chapter4_Task4;

class Exer2_Billing {

    private static double price = 0.0 ;
    private final double tax = 0.08;
    private double pTax = price * tax;
    private double computeBill;
    {
        Exer2_Billing.price = price;
        System.out.println(" Total including tax is" + pTax + price );
    }
    private double computeBill(double price, int quantity) {
        System.out.println("Total price and quantity is "+ pTax * +quantity);
        return ( price*quantity + 0.08 );
    }
    private double computeBill(double price, int quantity, double coupon) {
        Exer2_Billing.price = price;
        System.out.println("The total price including the coupon is " + (((pTax + quantity)-coupon)));
        return  (((pTax + quantity)-coupon));
    }
}