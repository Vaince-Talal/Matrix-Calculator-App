package project.matrix_calculator.utilities;

public class transposeUtilities {
    //Helper methods
    public static double[][] transpose(double[][] matrix){
        double[][] new_matrix = new double[matrix[0].length][matrix.length];
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < matrix.length; i++){
            count1 = 0;
            if(i != 0){
                count2 ++;
            }
            for(int j = 0; j < matrix[i].length;j++){
                new_matrix[count1][count2] = matrix[i][j];
                count1++;
            }
        }
        return new_matrix;
    }
}

