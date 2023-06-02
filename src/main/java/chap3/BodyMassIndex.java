package chap3;

import javax.swing.*;

public class BodyMassIndex {
    public static void main(String[] args){
        double weight, height, bmi;

        weight = Double.parseDouble(JOptionPane.showInputDialog("What is your weight (pounds):"));
        height = Double.parseDouble(JOptionPane.showInputDialog("What is your height (inches):"));

        bmi = weight/(Math.pow(height,2)) * 703;

        if(bmi < 18.5){
            JOptionPane.showMessageDialog(null,
                    "Your weight is underweight (BMI = "+
                            String.format("%.2f",bmi)
                            +").");
        } else if(bmi > 25){
            JOptionPane.showMessageDialog(null,"Your weight is overweight (BMI = "+
                    String.format("%.2f",bmi)
                    +").");
        } else {
            JOptionPane.showMessageDialog(null,"Your weight is optimal (BMI = "+
                    String.format("%.2f",bmi)
                    +").");
        }
        System.exit(0);
    }
}
