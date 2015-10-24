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
        
        position[6] = uni[position[0]][position[1]][position[2]][position[3]][position[4]];
        
        return position;
    }
    
}