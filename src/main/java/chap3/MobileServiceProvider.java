package chap3;

import javax.swing.*;
import static javax.swing.JOptionPane.*;

public class MobileServiceProvider {
    public static void main(String[] args){
        String subscriptionPackage;
        double defaultRate, defaultMinutes, extraMinRate, totalMinutes, totalCharges = 0.0;

        //Get Package letter
        subscriptionPackage = showInputDialog("Type the letter of your subscription package (A, B or C):");
        totalMinutes = Integer.parseInt(showInputDialog("Total minutes:"));

        if (subscriptionPackage.compareTo("A") == 0){
            defaultRate = 39.99;
            defaultMinutes = 450;
            extraMinRate = 0.45;

            if (totalMinutes <= defaultMinutes){
                totalCharges = defaultRate;
            } else {
                totalCharges = defaultRate + (extraMinRate * (totalMinutes - defaultMinutes));
            }
        } else if (subscriptionPackage.compareTo("B") == 0) {
            defaultRate = 59.99;
            defaultMinutes = 900;
            extraMinRate = 0.40;

            if (totalMinutes <= defaultMinutes){
                totalCharges = defaultRate;
            } else {
                totalCharges = defaultRate + (extraMinRate * (totalMinutes - defaultMinutes));
            }
        } else if (subscriptionPackage.compareTo("C") == 0) {
            totalCharges = 69.99;
        }

        JOptionPane.showMessageDialog(null, "Total charges : " + String.format("%.2f",totalCharges));
        System.exit(0);
    }
}
