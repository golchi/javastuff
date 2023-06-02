package chap3;

import javax.swing.*;

public class TestScoreGrade {
    public static void main(String[] args){
        int score1, score2, score3;
        double averageScore;
        String grade = "";

        //Get the scores
        score1 = Integer.parseInt(JOptionPane.showInputDialog("Entre score 1:"));
        score2 = Integer.parseInt(JOptionPane.showInputDialog("Entre score 2:"));
        score3 = Integer.parseInt(JOptionPane.showInputDialog("Entre score 3:"));

        averageScore = Math.round((float) (score1 + score2 + score3) /3);

        //Compare and get the grade
        if (averageScore < 60){
           grade = "F";
        } else if (averageScore < 70){
            grade = "D";
        } else if (averageScore < 80){
            grade = "C";
        } else if (averageScore < 90){
            grade = "B";
        } else if (averageScore < 100){
            grade = "A";
        }
        //Display the average and grade
        JOptionPane.showMessageDialog(null,"Average test score: "+
                averageScore +" - Grade is: " + grade );
    }
}
