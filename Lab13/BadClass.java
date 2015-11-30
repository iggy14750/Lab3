import java.io.*;
import java.util.*;

public class BadClass {

    public BadClass(){}
    
    public void readFile(String filename) throws FileNotFoundException {
        File f = new File(filename);
        Scanner reader = new Scanner(f);
        String firstline = reader.nextLine();
        reader.close();
    }
    
    
}