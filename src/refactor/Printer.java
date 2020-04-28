/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactor;

/**
 *
 * @author Andres
 */
public class Printer {
    
    final int RR = 50;         
    final int CC = 4;
    final int M = 1000;
    public void Printer(){}
    
    public void printPrimeNumbers(int[] numbers){
        int PAGENUMBER = 1;         
        int PAGEOFFSET = 1;
        int ROWOFFSET;
        int C;
        while (PAGEOFFSET <= M) {             
            System.out.print("The First ");             
            System.out.print(Integer.toString(M));             
            System.out.print(" Prime Numbers === Page ");             
            System.out.print(Integer.toString(PAGENUMBER));             
            System.out.println("\n");             
            for (ROWOFFSET=PAGEOFFSET; ROWOFFSET <= PAGEOFFSET+RR-1; ROWOFFSET++) {                 
                for (C = 0; C <= CC - 1; C++)                     
                    if (ROWOFFSET + C * RR <= M)                         
                    System.out.printf("%10d", numbers[ROWOFFSET + C * RR]);                 
                System.out.println();             
                
            }             
            System.out.println("\f");             
            PAGENUMBER++;             
            PAGEOFFSET += RR*CC; 
        }
    }
}
