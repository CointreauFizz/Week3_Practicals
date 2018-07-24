package Chapter4_Task4;

public class Exer5_SandwichFilling {

    private String filling;
    private int calories;
    Exer5_SandwichFilling(String fill, int cal)
    {
        filling = fill;
        calories = cal;
    }
    public String getSandwichFilling()
    {
        return filling;
    }
    public int getCalories()
    {
        return calories;
    }
}