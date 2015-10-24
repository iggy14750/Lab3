public class Scientist {
    
    private int[] position = new int[6];
    private Universe uni;
    
    public Scientist(Universe universe) {
        uni = universe;
    }
    /*
    the position array holds an int for each dimension
    */
    public int[] move(int dimension, int numUnits) {
        
        int dimensionalStatus = position[dimension-1];
        position[dimension-1] = (10+((dimensionalStatus+numUnits)%10))%10;
        /*if (proposedSatus<0){ 
            position[dimension-1]=(10+proposedSatus);
        } else {
            position[dimension-1]=proposedSatus;
        } */
        
        int i = position[0];
        int j = position[1];
        int k = position[2];
        int l = position[3];
        int m = position[4];
        
        position[5] = uni.getter(i, j, k, l, m);
        
        return position;
    }
    
}