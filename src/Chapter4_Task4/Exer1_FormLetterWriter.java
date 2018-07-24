package Chapter4_Task4;

public class Exer1_FormLetterWriter {

    public static void main(String[] args)
    {
        displaySalutation("Skywalker");
        displayLetter();
        displaySalutation("Darth", "Luke");
        displayLetter();
    }
    private static void displaySalutation(String lastName)
    {
        System.out.println("Dear Mr. or Ms. " + lastName + ",");
    }
    private static void displaySalutation(String firstName, String lastName)
    {
        System.out.println("Dear " + firstName + " " + lastName + ",");
    }
    private static void displayLetter()
    {
        System.out.println("   Thank you for your recent order.\n");
    }
}