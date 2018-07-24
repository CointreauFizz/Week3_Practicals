package Chapter4_Task4;

import java.time.*;

class Exer3_FitnessTracker {

    String activity;
    int minutes;
    LocalDate date;
    // constructor added for Exercise 3a
    Exer3_FitnessTracker()
    {
        activity = "running";
        minutes = 1;
        date = LocalDate.of(2018, 9, 9);
    }
    // constructor added for Exercise 3b
    Exer3_FitnessTracker(String a, int m, LocalDate d)
    {
        activity = a;
        minutes = m;
        date = d;
    }
    String getActivity()
    {
        return activity;
    }
    int getMinutes()
    {
        return minutes;
    }
    LocalDate getDate()
    {
        return date;
    }

}