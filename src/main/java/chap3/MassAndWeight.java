package chap3;

import javax.swing.*;

public class MassAndWeight {
    public static void main(String[] args){
        double mass, weight;

        mass = Double.parseDouble(JOptionPane.showInputDialog("Enter your mass (kg): "));
        weight = Math.round(mass * 9.8);

        if (weight > 1000) {
            JOptionPane.showMessageDialog(null," Weight: " +
                    weight +" -  Your object is too heavy");
        } else if(weight < 10 ){
            JOptionPane.showMessageDialog(null," Weight: " +
                    weight +" -  You object is too light");
        }
    }
}
