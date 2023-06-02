package chap3;

import javax.swing.*;

public class RomanNumerals {
    public static void main(String[] args){
        int number;
        String message;

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 1 and 10: "));
        if ((number <1) || (number >10)){
            JOptionPane.showMessageDialog(null, "Wrong number");
        }
        if (number == 1) {
            message = "I";
        }
    }
}
