/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01;

/**
 *
 * @author Arthur
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        
        while (cc < 10) {
            cc++;
            if (cc == 1 || cc == 3) {
                continue;
            }
            
            if (cc == 6) {
                break;
            }
            
            System.out.println("Cambalhota " + cc);
        }
    }
    
}
