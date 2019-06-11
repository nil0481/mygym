package com.example.workout;

import java.util.ArrayList;
import java.util.List;

public class advise {
    List<String> workname (String worktype) {
        List<String> work = new ArrayList<String>();
        if (worktype.equals("chest")) {
            work.add("1. Bench press");
            work.add("2. Flat Bench Dumbbell Press");
            work.add("3. Low-Incline Barbell Bench Press");
            work.add("4. Machine Decline Press ");
            work.add("5. Incline Dumbbell Press");
            work.add("6. Cable fly");
            work.add("7. Dips For Chest");
        }
        else if (worktype.equals("leg"))
        {
            work.add("1. Barbell Squat\n\n" +
                    "2. Dumbbell Lunges\n\n" +
                    "3. Leg Press\n\n" +
                    "4. Lying Leg Curls\n\n" +
                    "5. Leg Extensions.");
        }
        else if (worktype.equals("tricep"))
            work.add("1. Close-Grip Barbell Bench Press\n\n" +
                    "2. Parallel Bar Dip\n\n" +
                    "3. Decline EZ Bar Triceps Extension\n\n" +
                    "4. Tricep Dumbbell Kickback.");
        else if (worktype.equals("shoulder"))
            work.add("1. Barbell Shoulder Press\n\n" +
                    "2. One-Arm Side Laterals\n\n" +
                    "3. Front Plate Raise\n\n" +
                    "4. Lying Rear Delt Raise");
        else if (worktype.equals("bicep")){
            work.add("1. STANDING BARBELL CURL");
        work.add("2. CONCENTRATION CURL");
        work.add("3. HAMMER CURL");
        work.add("4. OFFSET-GRIP DUMBBELL CURL");
        work.add("5. STATIC DUMBBELL CURL");}

        return work;
    }


}
