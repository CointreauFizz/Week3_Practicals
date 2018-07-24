package Chapter4_Task4;

import java.time.*;

public class Exer3_TestFitnessTracker {

    public static void main(String[] args)
    {
        Exer3_FitnessTracker exercise = new Exer3_FitnessTracker();

        System.out.println(exercise.getActivity() + " " + exercise.getMinutes() +
                " minutes on " + exercise.getDate());

        // code to test constructor added for exercise 3b

        LocalDate date = LocalDate.of(2018, 8, 9);
        Exer3_FitnessTracker exercise2 = new Exer3_FitnessTracker("bicycling", 30, date);

        System.out.println(exercise2.getActivity() + " " + exercise2.getMinutes() +
                " minutes on " + exercise2.getDate());
    }
}