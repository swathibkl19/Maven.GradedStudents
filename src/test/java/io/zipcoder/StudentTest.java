package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    String firstName;
    String lastName;

    ArrayList<Double> examScores;
    int i = 0;
    ArrayList<Double> totalScore = new ArrayList<Double>();

    @Test
    public void addExamScoreTest() {

        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {};
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100.0);
        String output = student.getExamScores();

        // Then
        System.out.println(output);
        String expectedOutput = "Exam Scores:\n" +
                "\tExam 1 -> 100";
        Assert.assertEquals(expectedOutput, output);
    }

    @Test
    public void setExamScoreTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0};
        Student student = new Student(firstName, lastName, examScores);

// When
        student.setExamScore(1, 150.0);
        String output = student.getExamScores();

// Then
        System.out.println(output);
        String expectedOutput = "Exam Scores:\n" +
                "\tExam 1 -> 150";
        Assert.assertEquals(expectedOutput, output);

    }

    //    @Test
//        public void getNumberOfExamsTakenTest(){
//
//            return null;
//        }
    @Test
    public void getAverageExamScoreTest() {

        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        double output = student.getAverageExamScore();

        // Then
        System.out.println(output);
        // Assert.assertEquals(expectedOutput,output);
    }

    @Test
    public void getExamScoresTest() {

        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.getExamScores();

        // Then
        System.out.println(output);

        String expectedOutput = "Exam Scores:\n" +
                "\tExam 1 -> 100\n" +
                "\tExam 2 -> 95\n" +
                "\tExam 3 -> 123\n" +
                "\tExam 4 -> 96";
        Assert.assertEquals(expectedOutput, output);

    }

    //    @Test
//        public void takeExamTest(){}
//    @Test
//
//        public void getFirstNameTest() {
//
//
//        }
//    @Test
//        public void setFirstNameTest() {
//
//            this.firstName = firstName;
//        }
//
//    @Test
//    public void getLastNameTest() {
//
//
//        }
//    @Test
//
//        public void setLastNameTest() {
//
//            this.lastName = lastName;
//        }
    @Test
    public void toStringTest() {
         // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.toString();

        // Then
        System.out.println(output);
        String expected = "\t\tStudent Name: Leon Hunter\n" +
                "\t\t> Average Score: 125\n" +
                "\t Exam Scores:\n" +
                "\tExam 1 -> 100\n" +
                "\tExam 2 -> 150\n" +
                "\tExam 3 -> 250\n" +
                "\tExam 4 ->  0";
        Assert.assertEquals(expected,output);

    }
}





