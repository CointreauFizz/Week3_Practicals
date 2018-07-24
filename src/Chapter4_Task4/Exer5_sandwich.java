package Chapter4_Task4;

public class Exer5_sandwich {

    private Exer5_Bread bread;
    private Exer5_SandwichFilling filling;
    public Exer5_sandwich(String bread, int breadCal, String filling, int fillingCal)
    {
        this.bread = new Exer5_Bread(bread, breadCal);
        this.filling = new Exer5_SandwichFilling(filling, fillingCal);
    }
    public Exer5_Bread getBread()
    {
        return bread;
    }
    public Exer5_SandwichFilling getSandwichFilling()
    {
        return filling;
    }
}