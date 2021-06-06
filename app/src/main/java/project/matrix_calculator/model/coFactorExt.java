package project.matrix_calculator.model;
import project.matrix_calculator.utilities.determinantUtilities;

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
        return getCoFactor(matrix);
    }


}
