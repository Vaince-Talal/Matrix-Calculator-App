package project.matrix_calculator.model;
import java.util.ArrayList;
import project.matrix_calculator.utilities.*;

public class matrixDeterminant {

    private double matrix[][];
    private ArrayList<String> steps;
    private double det;
    private int nop;

    public matrixDeterminant(double[][] matrix){
        this.matrix = matrix;
    }
    //Mutators
    public void set_det(double[][] matrix){
        this.det = determinantUtilities.Calculate_det(matrix);
    }
    //Assessors
    public String getSteps(){
        String result = "";
        for(int i = 0; i < steps.size();i++){
            result += steps.get(i);
        }
        return result;
    }


}
