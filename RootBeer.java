import java.util.Scanner;
public class RootBeer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            boolean validInt=false;
            int input = 0;
            System.out.print("How many bottles of root beer are on the wall? >");
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                if (input==-1) {
                    System.out.println("Goodbye :>");
                    System.exit(0);
                }
                validInt = ((input>0) && (input<100));
            } else {
                String throwaway = new String(sc.next());
                System.out.println("Please enter a number 1-100, or -1 to quit :>");
                continue;
            }
            
            if (validInt) {
                char R = 'R';
                for (int i=input;i>0;i--) {
                    for (int b=i;b>0;b--) {
                        System.out.print(R);
                    }
                    System.out.println("");
                }
                System.out.println("THERE'S NO MORE ROOT BEER!!");
            } else {
                System.out.println("Please enter a number 1-100, or -1 to quit");
                continue;
            }
        }
    }
}