public class ZenoPwnd {
    public static void main(String[] args) {
        double dist2Helen = 10.;
        int counter = 0;
        while (dist2Helen!=0.) {
            counter+=1; //a step is taken
            dist2Helen= dist2Helen/2.;
        }
        System.out.println("It took " + counter + " steps to get to Helen, yay!");
    }
}