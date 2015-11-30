public class CoogieException extends Exception {
    private int numCats;
    public CoogieException(int numCats) {
        this.numCats = numCats;
    }
    
    public String toString() {
        return numCats + " Cats! That's too many cats!";
    }
}