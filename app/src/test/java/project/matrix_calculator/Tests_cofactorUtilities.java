package project.matrix_calculator;

import org.junit.Test;

import project.matrix_calculator.utilities.cofactorUtilities;

import static org.junit.Assert.*;

public class Tests_cofactorUtilities {
    @Test
    public void Test01(){//Testing a 3x3 matrix
        double[][] matrix  = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        double[][] expected = {
                {-3,6,-3},
                {6,-12,6},
                {-3,6,-3}
        };
        assertArrayEquals(expected,cofactorUtilities.cofac_matrix(matrix));
    }
    @Test
    public void Test02(){//Testing a 2x2 matrix
        double[][] matrix = {
                {1,2},
                {3,4}
        };
        double[][] expected = {
                {4,-2},
                {-3,1}
        };
        assertArrayEquals(expected,cofactorUtilities.cofac_matrix(matrix));
    }
    @Test
    public void Test03(){//Testing a 4x4 matrix
        double[][] matrix = {
                {1,3,1,4},
                {3,9,5,15},
                {0,2,1,1},
                {0,4,2,3}
        };
        double[][] expected = {
                {-1,-3,6,0},
                {-1,1,-2,0},
                {-20,0,-12,8},
                {13,-1,6,-4}
        };
        assertArrayEquals(expected,cofactorUtilities.cofac_matrix(matrix));
    }
}