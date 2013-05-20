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
    
    /* 
     * This method gives a short introduction to the user.
     */
    public void appIntro() {  
        System.out.println("MathCalc");
        System.out.println("--------");
        System.out.println("");
        System.out.println("MathCalc can help you to calculate simple vector problems.\n"
                         + "All options are based on 2 vectors, only the triple product\n"
                         + "requires the input of an additional vector. After the calculation\n"
                         + "is finished you return to the main menu for the next selection.\n"
                         + "In the first step you need to enter a dimension between 1 and 7.");
    }
    
    /*
     * This method contains all menu items. 
     */
    public void menu() {
        System.out.println("\n\nMenu\n"
                         + "====");
        System.out.println("(1) Addition of vectors");
        System.out.println("(2) Difference of vectors");
        System.out.println("(3) Scalar Product of vectors");
        System.out.println("(4) Unit of a vector");
        System.out.println("(5) Length of a vector");
        System.out.println("(6) Vector product");
        System.out.println("(7) Triple product");
        System.out.println("(8) Exit");    
    }

    /*
     * This method contains the menu selection and catches incorrect inputs.
     */
    public int menuSelection() {
        int selection = 0;
        selection = readInteger("Please choose: ");
        if (selection > 8 || selection < 1) {
            System.out.println("The input was incorrect. Please choose a number"
                    + " between 1 and 8.");
            selection = readInteger("Please choose: ");
        }            
        return selection;
    }
    /*
     * The method inputDimension defines via user input the dimension of the vectors. 
     */
    public int inputDimension() {
        int dimension = readInteger("\nEnter dimension of vectors: ");
        if (dimension > 7 || dimension < 1) {
            System.out.println("The input was incorrect. Please choose a dimension"
                             + " between 1 and 7.");
            dimension = readInteger("Please enter a dimension between 1 and 7: ");
        } 
        return dimension;
    }
}
