/**
 * 
 * This pogramm helps the user to calculate different operations of vectors. 
 * The dimension in which the applications calculates is limited to a range 
 * from 1 to 7. The user is presented a main menu where he can choose from the 
 * following options: 
 * - addition
 * - subrstraction
 * - scalar product
 * - vector unit 
 * - vector length
 * - vector product
 * - triple product
 * - exit
 * after the calculation the user is asked if he wants to choose another option.
 *
 *  @author marta
 */

package mathcalc;

public class MathCalc {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu menu = new Menu();
        Vector vector1;
        Vector vector2;
        Vector vector3;
        boolean running = true;
        
        menu.appIntro();
        int dimension = menu.inputDimension();
        vector1 = new Vector(dimension);
        vector2 = new Vector(dimension);
        System.out.printf("\n\nIn the following you need to enter the values of the vectors.\n");
        vector1.inputValue();
        vector2.inputValue();
        
        do { 
            menu.menu();
            int selection = menu.menuSelection();         
            switch(selection) {
                    
                case 1:  
                    vector1.addition(vector2);
                    break;

                case 2:
                    vector1.difference(vector2);
                    break;

                case 3:
                    vector1.scalarProduct(vector2);
                    break;

                case 4:
                    vector1.unitVector(vector2);
                    break;

                case 5:
                    vector1.vectorLength(vector2);
                    break;

                case 6:
                    if (dimension == 3) {
                        vector1.crossProduct(vector2);
                    } else
                        System.out.println("\nSorry, but at the moment, cross "
                                         + "product calculation is only possible for"
                                         + " dimension 3.\n");                      
                    break;

                case 7:                   
                    vector3 = new Vector(dimension);
                    if (dimension == 3) {
                        vector3.inputValue();
                        vector3.tripleProduct(vector1, vector2);
                    } else
                        System.out.println("\nSorry, but at the moment, triple product "
                                         + "calculation is only possible for"
                                         + " dimension 3.\n");                   
                    break;
        
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Something went wrong!!");
            }
        } while(running);
    }
}

