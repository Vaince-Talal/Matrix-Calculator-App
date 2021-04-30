package project.matrix_calculator;

import org.junit.Test;
import project.matrix_calculator.model.*;

import static org.junit.Assert.*;

public class Tests_det {
    @Test
    public void test_01() { //Testing a 2x2 matrix
        double[][] matrix = {
                 {2,3}
                ,{2,3}};
        double det = 0.0;
        assertEquals(Matrix_determinant.Calculate_det(matrix),det,1);

    }
    @Test
    public void test_02(){ //Testing a 2x2 matrix thats not det = 0
        double[][] matrix = {
                {1,2},
                {3,4}
        };
        double det = -2.0;
        assertEquals(Matrix_determinant.Calculate_det(matrix),det,1);
    }

    @Test
    public void test_03(){ //Testing a 3x3 matrix(det = 0)
        double[][] matrix = {
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };
        double det  = 0.0;
        assertEquals(Matrix_determinant.Calculate_det(matrix),det,1);
    }

    @Test public void test_04(){ //Testing a 3x3 matrix(non zero det)
        double[][] matrix = {
                {1,3,6},
                {9,-5,4},
                {-4,7,-8}
        };
        double det = 438;
        assertEquals(Matrix_determinant.Calculate_det(matrix),det,0);
    }
}