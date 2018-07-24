package Chapter4_Task4;

import java.time.*;

class Exer3_FitnessTracker2 {

    private String activity;
    private int minutes;
    private LocalDate date;
    Exer3_FitnessTracker2()
    {
        this("running", 1, LocalDate.of(2018, 9, 9));
    }
    Exer3_FitnessTracker2(String a, int m, LocalDate d)
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

