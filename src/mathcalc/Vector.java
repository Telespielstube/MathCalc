/*
 * The vector class contains all methods to calculate the results of the vectors.
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
    
    /*
     * The Constructor is responsible to construct the appereance of the object.
     * 
     * @parameter dimension    holds the number of the dimension of the vectors
     * 
     */
    public Vector(int dimension) {
        this.dimension = dimension;    
    }
    
    double[] vectorArray;
    int dimension;
    
    /* 
     * The method inputValue handles the user input.
     */
    public void inputValue() {
        vectorArray = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            double value = readDouble("Input " + (i+1) + ". value of vector: ");
            vectorArray[i] = value;
        }   
    }

    /*
     * The method addition adds the entered vectors and prints the result on screen.
     * 
     * @param vector2       contains the values of the second vector.
     */
    public void addition(Vector vector2) {
        double sum = 0.0;
        for (int i = 0; i < dimension; i++) {
            sum += this.vectorArray[i] + vector2.vectorArray[i];         
        }    
        System.out.println("\nThe sum of the vectors is:"
                         + "\n==========================");
        System.out.printf("%9.4f", sum);
    }
    
    /*
     * The method difference differenciates the entered vectors and prints the result on screen.
     * 
     * @param vector2       contains the values of the second vector.
     */
    public void difference(Vector vector2) {
        double difference = 0.0;
        for (int i = 0; i < dimension; i++) {
            difference -= this.vectorArray[i] - vector2.vectorArray[i];               
        } 
        System.out.println("\nThe difference of the vectors is:"
                         + "\n=================================");
        System.out.printf("%9.4f", difference);
    }
    
    /*
     * This method assigns two vectors to a number and prints the result on screen.
     * 
     * @param vector2       contains the values of the second vector.
     */
    public void scalarProduct(Vector vector2) {
        double scalarProduct= 0.0;
       
        for (int i = 0; i < dimension; i++) {
            scalarProduct += this.vectorArray[i] * vector2.vectorArray[i];  
        }
        System.out.println("\nThe scalar product is:"
                         + "\n======================");
        System.out.printf("%9.4f\n", scalarProduct);
            
    }
    
    /*
     * This method calculates the unit vector of the entered vector and prints the result on screen.
     * 
     * @param vector2       contains the values of the second vector.
     */
    public void unitVector(Vector vector2) {
        double square1 = 0.0;
        double square2 = 0.0;
        double unitVector1 = 0.0;
        double unitVector2 = 0.0;
        
        for (int i = 0; i < dimension; i++) {
            square1 += Math.pow(this.vectorArray[i],2);
        }
        for (int i = 0; i < dimension; i++) {
            square2 += Math.pow(vector2.vectorArray[i],2);
        }
        System.out.println("\nThe unit of the vectors is:"
                       + "\n===========================");
        unitVector1 = Math.sqrt(square1);
        unitVector2 = Math.sqrt(square2);
        System.out.println("Vector 1:");
        for (int i = 0; i < dimension; i++) {
            vectorArray[i] /= unitVector1;
            System.out.printf("%9.4f\n", vectorArray[i]);
        }
        System.out.println("Vector 2:");
        for (int i = 0; i < dimension; i++) {
            vectorArray[i] /= unitVector2;
            System.out.printf("%9.4f\n", vectorArray[i]);
        }     
    }
    
    /*
     * The method vectorLength calculates the length of one vector based on the 
     * entered values.
     * 
     * @param vector2       contains the values of the second vector.
     */
    public void vectorLength(Vector vector2) {
        double lengthVector1 = 0.0;
        double lengthVector2 = 0.0;
        double square1 = 0.0;
        double square2 = 0.0;
        
        for (int i = 0; i < dimension; i++) {
            square1 += Math.pow(this.vectorArray[i], 2);           
        }
        for (int i = 0; i < dimension; i++) {
            square2 += Math.pow(vector2.vectorArray[i], 2);
        }
        lengthVector1 = Math.sqrt(square1);
        lengthVector2 = Math.sqrt(square2);
        System.out.println("\nThe length of the vectors is:"
                       + "\n=============================");
        System.out.printf("Vector 1: %9.4f\n", lengthVector1);
        System.out.printf("Vector 2: %9.4f\n", lengthVector2);
    }
    
    /*
     * The method vectorProduct calculates the cross product of two vectors and 
     * outputs the result on screen.
     * 
     * @param vector2       contains the values of the second vector.
     */
    public void crossProduct(Vector vector2) {       
        double product1 = this.vectorArray[1] * vector2.vectorArray[2] - this.vectorArray[2] * vector2.vectorArray[1]; 
        double product2 = this.vectorArray[2] * vector2.vectorArray[0] - this.vectorArray[0] * vector2.vectorArray[2]; 
        double product3 = this.vectorArray[0] * vector2.vectorArray[1] - this.vectorArray[1] * vector2.vectorArray[0];
        System.out.printf("\nThe result of the cross product is:"
                        + "\n===================================\n "
                        + "%9.4f\n%9.4f\n%9.4f\n", product1, product2, product3);
    }
    
    /*
     * The method vectorProduct calculates the scalar product out of the cross product 
     * of three vectors and outputs the result on screen.
     * 
     * @param vector1       contains the values of the first vector.
     * @param vector2       contains the values of the second vector.
     */
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
            System.out.println("\nThe result of the triple product is:"
                    +        "\n====================================");
            System.out.printf("%9.4f", result);
        } 
}




