package chap3;

import javax.swing.*;
public class SortedNames {
    public static void main(String[] args){
        String name1, name2, name3, bufferName;
        name1 = JOptionPane.showInputDialog("Enter name 1: ");
        name2 = JOptionPane.showInputDialog("Enter name 2: ");
        name3 = JOptionPane.showInputDialog("Enter name 3: ");

        if(name1.compareToIgnoreCase(name2) > 0){
            bufferName = name1;
            name1 = name2;
            name2 = bufferName;
        }

        if(name1.compareToIgnoreCase(name3) > 0){
            bufferName = name1;
            name1 = name3;
            name3 = bufferName;
        }

        if(name2.compareToIgnoreCase(name3) > 0){
            bufferName = name2;
            name2 = name3;
            name3 = bufferName;
        }

        JOptionPane.showMessageDialog(null, "Sorted names are: "
                + name1 + ", " + name2 + ", "  + name3);
    }
}
