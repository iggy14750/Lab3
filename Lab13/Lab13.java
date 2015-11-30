import java.io.*;
import java.util.*;

public class Lab13 {
    public static void main(String[] args) {
        
        int numCats = 14;
        try {
            throw (new NoogieException());
        } catch (NoogieException ne) {
            exPrinter(ne.toString());
        }
        
        try {
            throw (new CoogieException(numCats));
        } catch (CoogieException ce) {
            exPrinter(ce.toString());
        }
        
        BadClass bc = new BadClass();
        
        try {
            bc.readFile("iDontExist.txt");
        } catch (FileNotFoundException fnf) {
            exPrinter(fnf.toString());
        }
        
        // try {
            
        // }
        
        
    }
    
    private static void exPrinter(String ex) {
        System.out.println("Error! We had a \"" + ex + "\" excpetion!!");
    }
}