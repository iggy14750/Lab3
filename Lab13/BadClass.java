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
    
    public void makeArray() throws NegativeArraySizeException {
        int[] uhoh = new int[-1];
    }
    
    public void accessArray() throws ArrayIndexOutOfBoundsException {
        int[] ohno = new int[3];
        int baddy = ohno[4];
    }
    
    public void addToArray() throws ArrayStoreException {
        Object x[] = new String[3];
        x[0] = new Integer(0);
    }
    
    public void badMath() throws ArithmeticException {
        int nope = 1/0;
    }
    
    public void strConverter() throws NumberFormatException {
        String greg = "Hello, world!";
        int brady = Integer.parseInt(greg);
    }
    
}