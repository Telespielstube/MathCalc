/*
 * The vector class contains all methods to calculate the results of values ot the vectors.
 * 
 * 
 */
package mathcalc;

import static Prog1Tools.IOTools.*;
import java.lang.Math.*;

/**
 *
 * @author marta
 */
public class Vector {
    
    public Vector() {}

    public Vector(int dimension) {
        this.dimension = dimension;    
    }
    
    double[] vectorArray;
    int dimension;
    
    /* The method inputValue handles the user input.
     * 
     */
    public void inputValue() {
        vectorArray = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            double value = readDouble("Input " + (i+1) + ". value of vector: ");
            vectorArray[i] = value;
        }   
    }

    public void addition(Vector vector2) {
        for (int i = 0; i < dimension; i++) {
            this.vectorArray[i] += vector2.vectorArray[i];         
            System.out.println("The result: \n" + vectorArray[i]);
        }    
    }

    public void difference(Vector vector2) {
        for (int i = 0; i < dimension; i++) {
            this.vectorArray[i] -= vector2.vectorArray[i];         
            System.out.println("The result: \n" + vectorArray[i]);
        }    
    }
  
    public void scalarProduct(Vector vector2) {
        double scalarProduct= 0.0;
        System.out.println("The result is:\n==============");
        for (int i = 0; i < dimension; i++) {
            scalarProduct += this.vectorArray[i] * vector2.vectorArray[i];         
            System.out.printf("%9.4f\n", scalarProduct);
        }    
    }
    
    public void vectorUnit() {
        double square = 0.0;
        double unit = 0.0;
        for (int i = 0; i < dimension; i++) {
            square += Math.pow(this.vectorArray[i],2);
        }
        System.out.println("The result is:\n==============");
        unit = Math.sqrt(square);
        for (int i = 0; i < dimension; i++) {
            vectorArray[i] /= unit;
            System.out.printf("%9.4f\n", vectorArray[i]);
        }
    }
    
    public void vectorLength() {
        double result = 0.0;
        double square = 0.0;
        for (int i = 0; i < dimension; i++) {
           square += Math.pow(this.vectorArray[i], 2);
        }
        result = Math.sqrt(square);
        System.out.printf("The norm of the vector is: %5.5f", result);
    }
    
    public void vectorProduct(Vector vector2) {
        double product1 = this.vectorArray[1] * vector2.vectorArray[2] - this.vectorArray[2] * vector2.vectorArray[1]; 
        double product2 = this.vectorArray[2] * vector2.vectorArray[0] - this.vectorArray[0] * vector2.vectorArray[2]; 
        double product3 = this.vectorArray[0] * vector2.vectorArray[1] - this.vectorArray[1] * vector2.vectorArray[0];
        System.out.printf("\nThe result:\n===========\n "
                          + "%10.2f\n%11.2f\n%11.2f\n", product1, product2, product3);
        double[] productArray = {product1, product2, product3};
    }
    
    public void tripleProduct(Vector vector1, Vector vector2) {
        double result = 0;
        double product1 = vector1.vectorArray[1] * vector2.vectorArray[2] - vector1.vectorArray[2] * vector2.vectorArray[1]; 
        double product2 = vector1.vectorArray[2] * vector2.vectorArray[0] - vector1.vectorArray[0] * vector2.vectorArray[2]; 
        double product3 = vector1.vectorArray[0] * vector2.vectorArray[1] - vector1.vectorArray[1] * vector2.vectorArray[0];
        double[] productArray = {product1, product2, product3};
        for (int i = 0; i < dimension; i++) {
            this.vectorArray[i] *= productArray[i];
        }
        for (int i = 0; i < this.vectorArray.length; i++) {
            result += this.vectorArray[i];
        }
        System.out.println("The result: \n" + result);
    } 
}




