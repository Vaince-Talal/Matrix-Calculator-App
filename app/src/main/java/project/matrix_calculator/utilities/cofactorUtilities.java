package project.matrix_calculator.utilities;
import project.matrix_calculator.utilities.determinantUtilities;

public class cofactorUtilities {

    //Helper methods for coFactorExt
    public static double[][] generate_matrix(double[][] matrix, int col, int row){
        double[][] new_matrix = new double[matrix.length-1][matrix.length-1];
        int count1 = 0; //row count
        int count2= 0; //col count

        for(int i = 0; i < matrix.length; i++){
            if(i != 0 ){
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

    public static double[][] generate_cofac_matrix(double[][] matrix){
        double coFacMatrix[][] = new double[matrix.length][matrix.length];

        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j< matrix.length; j++){
                double[][] genMatrix = generate_matrix(matrix,j,i);
                coFacMatrix[i][j] = determinantUtilities.Calculate_det(genMatrix);
            }
        }
        return coFacMatrix;
    }
}
