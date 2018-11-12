/**
 * 给定一个NxN二维数组，将0元素所在的行和列元素全部变为0
 */
package array;

public class ChangeZeroInMatrix {

    /**
     * 先统计0元素，然后去改变矩阵
     * @param matrix
     * @return
     */
    public static int[][] changeMatrix(int[][] matrix){
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        for(int i = 0; i < matrix.length; i ++){
            for (int j = 0; j < matrix[i].length ; j++){
                if (matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for(int i = 0; i < matrix.length; i ++){
            for (int j = 0; j < matrix[i].length ; j++){
                if (row[i] || row[j]){
                    matrix[i][j] = 0;
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,0},{4,5,6},{0,7,8}};
        System.out.println("origin matrix");
        for(int i = 0; i < matrix.length; i ++){
            for (int j = 0; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        int[][] result = changeMatrix(matrix);
        System.out.println("changed matrix");
        for(int i = 0; i < result.length; i ++){
            for (int j = 0; j < result[i].length ; j++){
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
