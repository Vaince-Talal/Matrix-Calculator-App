package project.matrix_calculator.model;

public class Matrix_determinant {
    private double[][] squareMatrix = new double[0][0];
    private double det;
    private int size;

    public Matrix_determinant(int rows, int cols){
        squareMatrix = new double[rows][cols];
        this.size = squareMatrix.length;
    }
    //Mutators
    public double Calculate_det(double[][] matrix){
        double det = 0;
        if(matrix.length == 2)
        {
            det += (matrix[0][0]* matrix[1][1]) - (matrix[0][1]*matrix[1][0]);
        }
        else{
            for(int i = 0; i < matrix.length; i++){
                Calculate_det(generateMatrix(matrix, i));
                det += matrix[0][i] * Calculate_det(generateMatrix(matrix, i));
            }
        }
        return det;
    }

    //Helper Method
    public double[][] generateMatrix(double[][] matrix,int col){
        double[][] newMatrix = new double[matrix.length-1][matrix.length-1];
        for(int i = 1; i < matrix.length;i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(j == col){
                    continue;
                }
                newMatrix[i-1][j] = matrix[]
            }
        }
        return newMatrix;
    }
}
