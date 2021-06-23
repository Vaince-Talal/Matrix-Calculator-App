package project.matrix_calculator;
import org.junit.Test;
import project.matrix_calculator.utilities.transposeUtilities;
import static org.junit.Assert.*;

public class Tests_transposeUtilities {
    @Test
    public void test_01() { //Testing a 2x2 matrix
        double[][] matrix = {
                {1,2},
                {3,4}
        };
        double[][] expected = {
                {1,3},
                {2,4}
        };
        assertArrayEquals(transposeUtilities.transpose(matrix), expected);
    }

    @Test
    public void test_02(){//Testing a 3x2 matrix
        double[][] matrix = {
                {1,2},
                {3,4},
                {5,6}
        };
        double[][] expected = {
                {1,3,5},
                {2,4,6}
        };
        assertArrayEquals(transposeUtilities.transpose(matrix),expected);
    }

    @Test
    public void test_03(){ //Testing a 2x3 matrix
        double[][] matrix = {
                {1,2,3},
                {4,5,6}
        };
        double[][] expected = {
                {1,4},
                {2,5},
                {3,6}
        };
        assertArrayEquals(transposeUtilities.transpose(matrix),expected);
    }
    @Test
    public void test_04(){ //Testing a 3x3 matrix
        double[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        double[][] expected = {
                {1,4,7},
                {2,5,8},
                {3,6,9}
        };
        assertArrayEquals(transposeUtilities.transpose(matrix),expected);
    }

    @Test
    public void test_05(){ //Testing a 3x4 matrix
        double[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        double[][] expected = {
                {1,5,9},
                {2,6,10},
                {3,7,11},
                {4,8,12}
        };
        assertArrayEquals(transposeUtilities.transpose(matrix),expected);
    }
}