/*
 * The class menu contains all methods related to creating and choosing menu items.
 * 
 */
package mathcalc;
import static Prog1Tools.IOTools.*;
/**
 *
 * @author marta
 */
public class Menu {
    
    /* This method gives a short introduction to the user.
     * 
     */
    public void appIntro() {  
        System.out.println("MathCalc");
        System.out.println("--------");
        System.out.println("");
        System.out.println("MathCalc can help you to calculate simple vector problems.");
    }
    /*
     * This method contains all menu items.
     */
    public void menu() {
        System.out.println("");
        System.out.println("(1) Addition of vectors");
        System.out.println("(2) Difference of vectors");
        System.out.println("(3) Scalar Product of vectors");
        System.out.println("(4) Unit of a vector");
        System.out.println("(5) Length of a vector");
        System.out.println("(6) Vector product of vectors");
        System.out.println("(7) Triple product of vectors");
        System.out.println("(8) Exit");    
    }

    public int menuSelection() {
        int selection = 0;
        selection = readInteger("Please choose: ");
        return selection;
    }
    
    public int inputDimension() {
        int dimension = readInteger("\nInput the dimension: ");
        return dimension;
    }
}
