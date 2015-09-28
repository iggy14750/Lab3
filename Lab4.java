import java.ulit.Scanner;
public class Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name?");
        userName = sc.next();
        boolean dead = false;
        int utils = 0;
        while !dead {
            printOptions();
            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
            } else {
                String thowaway = sc.next();
                System.out.println("Type in your choice, 1, 2, 3, or 4, and hit Return");
                continue;
            }
            
            System.out.print("How many people were affected? >");
            if sc.hasNextInt() {
                int victims = sc.nextInt;
            }
            
            
            switch (choice) {
                case 1:
                    int deltaUtils = buyIceCream(victims);
                    optionOutcome(deltaUtils);
                    utils+=deltaUtils;
                    break;
                case 2:
                    int deltaUtils = stealIceCream(victims);
                    optionOutcome(deltaUtils);
                    utils+=deltaUtils;
                    break;
                case 3:
                    int deltaUtils = dream(victims);
                    optionOutcome(deltaUtils);
                    utils+=deltaUtils;
                    break;
                case 4:
                    dead = true;
                    break;
                default:
                    System.out.println("Type in your choice, 1, 2, 3, or 4, and hit Return");
        }
    }
    
    public static void printOptions() {
        System.out.print("(1) - Buy people ice cream\n(2) - Steal ice cream\n(3) - Dream about people eating ice cream\n(4) - Die.\n");
    }
    
    public static buyIceCream(int x) {
        return 3*x;
    }
    
    public static stealIceCream(int x) {
        return (-5)*x;
    }
    
    public static dream(int x) {
        return 0*x;
    }
}