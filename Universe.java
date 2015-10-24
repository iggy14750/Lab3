

public class Universe {
    private int[][][][][] universe;
    public Universe() {
        universe = new int[10][10][10][10][10];
        
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                for (int k=0; k<10; k++) {
                    for (int l=0; l<10; l++) {
                        for (int m=0; m<10; m++) {
                            
                            int color = (i+j+k+l+m)%10;
                            universe[i][j][k][l][m] = color;
                            
        } } } } }//Just saving space.
        
    }

    public int getter(int x, int y, int z, int a, int b) {
        return universe[x][y][z][a][b];
    }
}
