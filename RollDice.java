import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
public class RollDice {
    public static int[] RollDice(int rolls, Random Jerry){//Jerry Sienfield was random....what, nothin? Tough crowd.
        int[] rollLog = new int[11];
        for (int i=0;i<=rolls;i++){
            int theRoll = Jerry.nextInt(36);
            if (theRoll==0){
                //roll 2;
                rollLog[0]+=1;
            } else if (theRoll>=1 && theRoll<=2 ) {
                //roll 3
                rollLog[1]+=1;
            } else if (theRoll>=3 && theRoll<=5 ) {
                //roll 4
                rollLog[2]+=1;
            } else if (theRoll>=6 && theRoll<=9 ) {
                //roll 5;
                rollLog[3]+=1;
            } else if (theRoll>=10 && theRoll<=14 ) {
                //roll 6
                rollLog[4]+=1;
            } else if (theRoll>=15 && theRoll<=20 ) {
                //roll 7
                rollLog[5]+=1;
            } else if (theRoll>=21 && theRoll<=25 ) {
                //roll 8
                rollLog[6]+=1;
            } else if (theRoll>=26 && theRoll<=29 ) {
                //roll 9;
                rollLog[7]+=1;
            } else if (theRoll>=30 && theRoll<=32 ) {
                //roll 10
                rollLog[8]+=1;
            } else if (theRoll>=33 && theRoll<=34 ) {
                //roll 11
                rollLog[9]+=1;
            } else if (theRoll==35) {
                //roll 12
                rollLog[10]+=1;
            }
        }
        return rollLog;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random Jerry = new Random();
        String userGibberish = "";
        do {
            int[] rollValues = new int[11];
            int numRolls=0;
            System.out.println("How many times would you like to roll the dice?\nOr just type \"quit\" to quit at any time.");
            
            if (sc.hasNextInt()){
                numRolls = sc.nextInt();
                rollValues = RollDice(numRolls,Jerry);
                System.out.printf("RESULTS\n%-10s%-18s%s\n", ("Value"), ("Fraction"), ("Decimal"));
                for (int i=0;i<11;i++){
                    float decimal = ((float) rollValues[i])/((float) numRolls);
                    String fraction = new String(rollValues[i] + "/" + numRolls);
                    System.out.printf("%-10d%-18s%.4    f\n", (i+2), (fraction), (decimal));
                }
            } else {        
                userGibberish = sc.next();
            }
            
            
        } while (userGibberish!="quit");
        
    }
}










