

import java.io.File;
import java.io.FileWriter;
//import java.io.File.IOException;
import java.io.IOException;


public class Practice2 {
    public static void main(String[] args) {
        File myObj= new File("myfile.txt");
        if (myObj.delete()) {
            System.out.println("deleted the file:" + myObj.getName());
        } else{
            System.out.println("failed to delete the file");


        }

    }
}