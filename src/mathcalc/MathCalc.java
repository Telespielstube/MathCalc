/*
 * 
 * This pogramm helps the user to calculate different operations of vectors. 
 * The dimension in which the applications calculates is limited to a range 
 * from 1 to 7. The user can choose from the following options: 
 * addition, subrstraction, scalar product, vector unit, 
 * vector length, vector product and triple product.
 * 
 */

package mathcalc;

/**
 *
 * @author marta
 */
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
                    vector1.vectorUnit();
                    break;

                case 5:
                    vector1.vectorLength();
                    break;

                case 6:
                    vector1.vectorProduct(vector2);
                    break;

                case 7:                   
                    vector3 = new Vector(dimension);
                    vector3.inputValue();
                    vector3.tripleProduct(vector1, vector2);
                    break;

                case 8:
                    System.exit(0);
                default:
                    System.out.println("Something went wrong!!");
            }
        } while(running);
       }
}

