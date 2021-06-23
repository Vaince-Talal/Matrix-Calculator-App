package project.matrix_calculator.utilities;
import java.lang.Math;
public class determinantUtilities {

    //Helper Methods - used for matrixDeterminant.java
    public static double[][] generateMatrix(double[][] matrix,int col){
        int count = 0;
        double[][] newMatrix = new double[matrix.length-1][matrix.length-1];
        for(int i = 1; i < matrix.length;i++){
            count = 0;
            for(int j = 0; j < matrix[i].length; j++){
                if(j == col){
                    continue;
                }
                newMatrix[i-1][count] = matrix[i][j];
                count++;
            }
        }
        return newMatrix;
    }

    public static double Calculate_det(double[][] matrix) {
        double det = 0;
        if (matrix.length == 2) {
            det += (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        }
        else {
            for (int i = 0; i < matrix.length; i++) {
                det += Math.pow((-1), (i + 2)) * matrix[0][i] * Calculate_det(generateMatrix(matrix, i));
            }
        }
        return det;
    }

    public static String[][]steps(double[][] matrix){

        for(int i = 0; i < matrix.length;i++){
            
        }




        return null;
    }

}
