import java.util.Scanner;
import java.io.*;
public class Numericons {

    public static char[] generateUniverse(int seed) {
        char[] universe = new char[seed];
        for (int i = 0;i<seed;i++) {
            if (i%7==0) {//because this takes precedence over the carrots, this will suffice.
                universe[i] = (char) '0';
            } else if (i%5==0){
                universe[i]  = (char) '^';
            } else {
                universe[i] = (char) '.';
            }
        }
        return universe;
     } else}
    
    public static char[] proceed(char[] universe){
        for (int i =0; i<universe.length; i++){
            char dude = universe[i];
            if (dude=='0') {
                universe[i] = '1';
            } else if (dude == '1'){
                universe[i] = '2';
            } else if (dude == '2' && i<(universe.length-1)) {
                /*
		Only the adults move, but only if there's no one 
		in front of them.  If there's a carrot, they eat it 
		and become a baby... cuz... reasons. 
		So, the space they currently occupy has to be changed to 
		'.' and the next is a baby.
                if the next space is just empty, they just move in.
                We then don't want the next space to be considered, 
		so we incriment i.
                */
                if (universe[i+1] == '^') {
                    universe[i+1] = '0';
                    universe[i] = '.';
                    i++;
                } else if (universe[i+1] == '.') {
                    universe[i+1] = '2';
                    universe[i] = '.';
                    i++;
                }
            }
        }
        return universe;
    }
    
    public static void saver(char[] universe) throws IOException {
        
        PrintWriter io = new PrintWriter("universe.txt");
        io.println(universe);
        
        //Counting how many squirts (babies), chillens (children), and adults (adults), are in the universe.
        int squirts = 0;
        int chillens = 0;
        int adults = 0;
        for (char guy : universe) {
            switch (guy) {
                case '0':
                    squirts++;
                    break;
                case '1':
                    chillens++;
                    break;
                case '2':
                    adults++;
            }
        }
        //and then writing that.
        io.println("Babies: " + squirts);
        io.println("Children: " + chillens);
        io.println("Adults: " + adults);
        
        io.close();
        
    }
    
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        int seed;
        String otherCommand;
        System.out.print("How big would you like the universe to be? >");
        if (sc.hasNextInt()) {
            seed = sc.nextInt();
        } else {
            otherCommand = sc.next(); //Presumably, I should do something with this...
            seed = 0;
        }
        
        char[] myLittleUniverse = generateUniverse(seed);
        System.out.println(myLittleUniverse);
        String usrInput;
        
        System.out.println("Please type (Q)uit, (A)dvance, or (S)ave.");
        
        do {
            
            usrInput = sc.next().toLowerCase();
            
            switch (usrInput) {
                case "a":
                    myLittleUniverse = proceed(myLittleUniverse);
                    break;
                case "s":
                    saver(myLittleUniverse);
            }
            
            System.out.println(myLittleUniverse);
            
        } while (!usrInput.equals("q"));
        
        
    }

}







