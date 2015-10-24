import java.util.Scanner;
public class Lab08 {
    public static void main(String[] args) {
        Universe uni = new Universe;
        Scientist st = new Scientist(uni);
        Scanner sc = new Scanner();
        int[] position = new int[6];
        
        do {
            System.out.print("Enter dimension to travel (1,2,3,4,5) (negative to quit) >");
            int dimension = sc.nextInt();
            if (dimension<0) {
                System.exit(0);
            } else if ((dimension==0)||(dimension>5)) {
                System.out.println("Try again, the universe didn't accept that number.");
                continue;
            }
            System.out.print("Enter units to travel >");
            int units = sc.nextInt();
            position = Scientist.move(dimension, units);
            System.out.printf("Location: [ %d %d %d %d %d ] = %s\n", position[0], position[1], position[2], position[3], position[4], color(position[5]));
            
        } while (true);
    }
    
    public static String color(int thisVariableIsMeaningless) {
        switch (thisVariableIsMeaningless) {
            case 1:
                return "Lime";
            case 2:
                return "Cerulean";
            case 3:
                return "Goldenrod";
            default:
                return "Black";
        }
    }
    
}