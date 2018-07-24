package Chapter4_Task4;

public class Exer4_TestPatient {

        public static void main(String[] args)
        {
            Exer4_Patient p1 = new Exer4_Patient();
            Exer4_Patient p2 = new Exer4_Patient();
            Exer4_BloodData b2 = new Exer4_BloodData("A", "-");
            display(p1);
            display(p2);
            p1.setId();
            p1.setAge(42);
            Exer4_BloodData b = new Exer4_BloodData("AB", "-");
            p1.setBloodData(b);
            display(p1);
        }
        private static void display(Exer4_Patient p)
        {
            Exer4_BloodData bt = p.getBloodData();
            System.out.println("Patient #" + p.getId() + "  age: " + + p.getAge() +
                    "\n   The blood is type " + bt.getBloodType() + bt.getRhFactor());
        }

    }