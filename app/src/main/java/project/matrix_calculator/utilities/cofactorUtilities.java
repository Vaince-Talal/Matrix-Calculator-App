package project.matrix_calculator.utilities;
import java.lang.Math.*;


public class cofactorUtilities {

    //Helper methods for coFactorExt
    public static double[][] generate_matrix(double[][] matrix, int col, int row){  
        double[][] new_matrix = new double[matrix.length-1][matrix.length-1];
        int count1 = -1; //row count
        int count2= 0; //col count

        for(int i = 0; i < matrix.length; i++){
            if(row != i){
                count1++;
            }
            count2 = 0;
            for(int j = 0; j < matrix[i].length; j++){
                if(i == row ||j == col){
                    continue;
                }
                new_matrix[count1][count2] = matrix[i][j];
                count2++;
            }
        }
        return new_matrix;
    }

    public static double[][] cofac_matrix(double[][] matrix){
        double coFacMatrix[][] = new double[matrix.length][matrix.length];
        if(matrix.length ==  2){ //If the matrix is a 2x2 matrix, we are switching the 11 placement and the 22 positions and negating the 12 and 21
            coFacMatrix[0][0] = matrix[1][1];
            coFacMatrix[1][1] = matrix[0][0];
            coFacMatrix[0][1] = matrix[0][1]*-1;
            coFacMatrix[1][0] = matrix[1][0]*-1;
        }
        else{
            for(int i = 0; i < matrix.length; i++){
                for (int j = 0; j< matrix.length; j++){
                    double[][] genMatrix = generate_matrix(matrix,j,i);
                    coFacMatrix[i][j] = Math.pow(-1,(i+j))*determinantUtilities.Calculate_det(genMatrix);
                    if (coFacMatrix[i][j] == -0.0){
                        coFacMatrix[i][j] = 0;
                    }
                }
            }
            transposeUtilities.transpose(coFacMatrix);
        }
        return coFacMatrix;
    }
}
