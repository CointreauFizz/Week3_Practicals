package Chapter4_Task4;

public class Exer5_Bread {
        private String breadType;
        private int caloriesPerSlice;
        public final static String MOTTO = "The staff of life";

   public Exer5_Bread(String bread, int cal)
        {
            breadType = bread;
            caloriesPerSlice = cal;
        }
        public String getBreadType()
        {
            return breadType;
        }
        public int getCaloriesPerSlice()
        {
            return caloriesPerSlice;
        }
    }