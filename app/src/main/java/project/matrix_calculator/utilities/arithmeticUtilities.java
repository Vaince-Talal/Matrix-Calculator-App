package project.matrix_calculator.utilities;

public class arithmeticUtilities {
    //Main Functions
    public static double[][] add(double[][] matrix1,double[][] matrix2){
        double[][] new_matrix = subadd(matrix1,matrix2,"add");
        return new_matrix;
    }
    public static double[][] subtract(double[][] matrix1,double[][] matrix2){
        double[][] new_matrix = subadd(matrix1,matrix2,"sub");
        return new_matrix;
    }
    public static double[][] multiply(double num,double[][] matrix){
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[0].length;j++){
                matrix[i][j] *= num;
            }
        }
        return matrix;
    }


    //Helper function
    public static boolean sizeSubAdd(double[][] matrix1,double[][] matrix2){
        boolean result = false;
        if(matrix1.length == matrix2.length){
            if(matrix1[0].length == matrix2[0].length){
                result = true;
            }
        }
        return result;
    }
    public static double[][] subadd(double[][] matrix1,double[][] matrix2,String which){
        double[][] new_matrix = null;
        if(sizeSubAdd(matrix1,matrix2)){
            new_matrix = new double[matrix1.length][matrix1[0].length];
            for(int i = 0; i < matrix1.length;i++){
                for(int j = 0; j < matrix1[0].length;i++){
                    if(which == "add"){
                        new_matrix[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                    else if(which == "sub"){
                        new_matrix[i][j] = matrix1[i][j] - matrix2[i][j];
                    }
                }
            }
        }
        return new_matrix;
    }

}
