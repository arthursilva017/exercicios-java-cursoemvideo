/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano que você nasceu: ");
        int nasc = teclado.nextInt();
        int idade = (2025 - nasc);
        
        System.out.println("Você tem " + idade + " anos");
        
        if (idade >= 18) {
            System.out.println("MAIOR");
        } else {
            System.out.println("MENOR");
        }
    }
    
}
