package Chapter4_Task4;

public class Exer5_TestSandwich {
    public static void main(String[] args)
    {
        Exer5_sandwich s1 = new Exer5_sandwich("pumpernickel", 180, "egg salad", 220);
        Exer5_sandwich s2 = new Exer5_sandwich("multigrain", 200, "bologna", 260);
        Exer5_sandwich s3 = new Exer5_sandwich("whole wheat", 150, "grape jelly", 180);
        display(s1);
        display(s2);
        display(s3);
    }
    public static void display(Exer5_sandwich s)
    {
        final int SLICES = 2;
        Exer5_Bread b = s.getBread();
        Exer5_SandwichFilling sf = s.getSandwichFilling();
        System.out.println("The " + b.getBreadType() + " bread has " +
                b.getCaloriesPerSlice() + " calories per slice");
        System.out.println("  The " + sf.getSandwichFilling() + " filling has " +
                sf.getCalories() + " calories");
        int total = b.getCaloriesPerSlice() * SLICES + sf.getCalories();
        System.out.println("   The sandwich, with " + SLICES +
                " two slices of bread, has " +
                total + " calories");
    }
}