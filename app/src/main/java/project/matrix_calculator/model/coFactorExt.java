package project.matrix_calculator.model;
import project.matrix_calculator.utilities.determinantUtilities;
import project.matrix_calculator.utilities.cofactorUtilities;

public class coFactorExt {
    private double[][] matrix;
    private int row;
    private int col;

    //Constructor
    public coFactorExt(double[][] matrix){
        this.matrix = matrix;
    }
    //Accessors
    public double[][] getCoFactors(){
        return cofactorUtilities.cofac_matrix(matrix);
    }


}
