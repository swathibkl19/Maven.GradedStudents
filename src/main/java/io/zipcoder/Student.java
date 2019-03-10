package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String firstName;
    private String lastName;

    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(testScores));
    }

    public String getExamScores() {
        String result = "Exam Scores:";

        //System.out.println("Exam Scores:");

        for (int i = 0; i < examScores.size(); i++) {
            result = result + String.format("\n\tExam %d -> %2.0f", i + 1, examScores.get(i));
        }

        return result;
    }

    public void takeExam(double testScore) {
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }


    public void addExamScore(double v) {

        examScores.add(v);
    }

    public void setExamScore(int i, double v) {


        examScores.set(i - 1, v);


    }

    public double getAverageExamScore() {

      /*
        return examScores.stream()
                .mapToDouble( (x) -> x)
                .summaryStatistics()
                .getAverage();
                */

        Double totalScore = 0.0;
        Double averageScore;

        //for ( DataType singleVar : multiVar )
        for (Double score : examScores) {
            //First find the total score
            totalScore = totalScore + score;
        }

        //Average Score:
        averageScore = totalScore / examScores.size();

        return averageScore;
    }


//    @Override
//    public String toString() {
//        Double averageScore = getAverageExamScore();
//        String result = getExamScores();
//
//        System.out.println("Student Name :" + firstName + lastName);
//        System.out.println("Average Score:" + averageScore);
//        System.out.println(getExamScores());
//
//        return "Student{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", examScores=" + examScores +
//                '}';
//    }


    @Override
    public String toString() {
        return    "\t\tStudent Name: " + firstName + " " + lastName
                + String.format("\n\t\t> Average Score: %-1.0f",getAverageExamScore())
                + "\n\t " + getExamScores();
    }
}




