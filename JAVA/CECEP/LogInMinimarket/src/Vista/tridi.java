package Vista;

public class tridi {
    public static void main(String[] args) {
        int[][][] cubo = { {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}},
                        {{13, 14, 15, 16}, {17, 18, 19, 20}, {21, 22, 23, 24}} };
        
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    System.out.print(cubo[i][j][k] + " ");
                }  
                System.out.println();
            }
            System.out.println();
        }
    }
}
