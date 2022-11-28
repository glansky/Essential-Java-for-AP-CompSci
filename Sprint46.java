/**
 * Sprint 46 - Multidimensional Arrays
 */
public class Sprint46 {
    public static void main(String[] args){
        int[][] grid = new int[][] {{1,2,3,4},{5,6,7},{8,9},{10},{11,12,13,14}};
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.printf("%d\t", grid[row][col]);
            }
            System.out.println();
        }
    }
}
