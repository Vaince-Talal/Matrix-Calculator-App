package project.matrix_calculator.model;
import java.lang.Math;
import java.util.ArrayList;

public class Matrix_determinant {

    public static double Calculate_det(double[][] matrix){
        double det = 0;
        if(matrix.length == 2)
        {
            det += (matrix[0][0]* matrix[1][1]) - (matrix[0][1]*matrix[1][0]);
        }
        else{
            for(int i = 0; i < matrix.length; i++){
                det +=Math.pow(-1,(i+2))*matrix[0][i] * Calculate_det(generateMatrix(matrix, i));
            }
        }
        return det;
    }

    //Helper Method
    public static double[][] generateMatrix(double[][] matrix,int col){
        int count = 0;
        int count2 = -1;
        double[][] newMatrix = new double[matrix.length-1][matrix.length-1];
        for(int i = 1; i < matrix.length;i++){
            count = 0;
            count2++;
            for(int j = 0; j < matrix[i].length; j++){
                if(j == col){
                    continue;
                }
                newMatrix[count2][count] = matrix[i][j];
                count++;
            }
        }
        return newMatrix;
    }
}
