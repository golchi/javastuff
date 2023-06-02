package chap2;

import java.io.FileWriter;
import java.io.IOException;

public class MyFile {
    public static void main(String[] args){
        try {
            FileWriter myListFile = new FileWriter("customers.csv");
            myListFile.write("Id, Value\n");
            myListFile.write("1, Coucou\n");
            myListFile.write("2, Coulou");
            myListFile.close();
        } catch(IOException e){
            System.out.print("Error has occured");
            e.printStackTrace();
        }
    }
}
