package Chapter4_Task4;

public class Exer5_TestSandwichFilling {

    public static void main(String[] args)
    {
        Exer5_SandwichFilling sf1 = new Exer5_SandwichFilling("egg salad", 220);
        Exer5_SandwichFilling sf2 = new Exer5_SandwichFilling("ham", 240);
        Exer5_SandwichFilling sf3 = new Exer5_SandwichFilling("peanut butter", 280);
        display(sf1);
        display(sf2);
        display(sf3);
    }
    private static void display(Exer5_SandwichFilling s)
    {
        System.out.println("The " + s.getSandwichFilling() + " filling has " +
                s.getCalories() + " calories");
    }
}