package chap3;

import javax.swing.*;

public class MagicDates {
    public static void main(String[] args){
        int date, month, year;

        date = Integer.parseInt(JOptionPane.showInputDialog("Enter the date:"));
        month = Integer.parseInt(JOptionPane.showInputDialog("Enter the month:"));
        year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year -Two digits format-:"));

        if ((month * date) == year){
            JOptionPane.showMessageDialog(null,
                    "The date is magic","Information",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "The date is not magic",
                    "Warning",
                    JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }
}