
package aula13;

import java.util.Scanner;

/**
 *
 * @author Alberto Alexandre
 */
public class Aula13 {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Integer numProcessos = 5;
        int [] processos = new int[numProcessos];
        
        for (int i=0; i<numProcessos;++i){
            System.out.println("Insira o valor do primeiro Processo"+ (i+1)+ "º Processo");
            processos[i] = input.nextInt();
        }
        
         for (int i=0; i<numProcessos;++i){
            System.out.println("Processo nº"+ processos[i]);
          
        }
    }
    
}
