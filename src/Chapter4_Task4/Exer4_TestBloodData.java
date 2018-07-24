package Chapter4_Task4;

public class Exer4_TestBloodData {

        public static void main(String[] args)
        {
            Exer4_BloodData b1 = new Exer4_BloodData();
            Exer4_BloodData b2 = new Exer4_BloodData("A", "-");
            display(b1);
            display(b2);
            b1.setBloodType("AB");
            b1.setRhFactor("-");
            display(b1);
        }
        private static void display(Exer4_BloodData b)
        {
            System.out.println("The blood is type " + b.getBloodType() + b.getRhFactor());
        }

    }