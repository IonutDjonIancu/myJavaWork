package workbench1;

import java.util.ArrayList;

public class GradeAnalyzer {
    // a simple tool to help analyze classroom grades stored in an ArrayList
    public GradeAnalyzer() { }

    int getAverage(ArrayList<Integer> grades) {
        if (grades.size() < 1) {
            System.out.println("ArrayList is empty!");
            return 0;
        }
        else {
            int sum = 0;
            for (Integer n : grades) {
                sum += n;
            }
            int average = sum / grades.size();
            System.out.println(average);
            return average;
        }
    }

    void getLowest (ArrayList<Integer> grades) {
        int lowest = grades.get(0);

        for (Integer n : grades) {
            if (lowest > n) {
                lowest = n;
            }
        }
        System.out.println(lowest);
    }

    void getHighest (ArrayList<Integer> grades) {
        int highest = grades.get(0);

        for (Integer n : grades) {
            if (highest < n) {
                highest = n;
            }
        }
        System.out.println(highest);
    }


    public static void main(String[] args) {
        ArrayList<Integer> myClassroom = new ArrayList<Integer>();
        myClassroom.add(91);
        myClassroom.add(92);
        myClassroom.add(88);
        myClassroom.add(75);
        myClassroom.add(61);
        myClassroom.add(89);
        myClassroom.add(95);

        GradeAnalyzer myAnalyzer = new GradeAnalyzer();
        myAnalyzer.getAverage(myClassroom);
        myAnalyzer.getLowest(myClassroom);
        myAnalyzer.getHighest(myClassroom);

    }
}