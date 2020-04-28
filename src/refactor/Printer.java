/*
 * La clase Printer albergará todas las funciones necesarias para imprimir por pantalla, no solo números primos
 */
package refactor;

/**
 *
 * @author Andres
 */
public class Printer {
    
    final int RR = 50;         
    final int CC = 4;
    
    public void Printer(){}
    
    /*
    * Imprime los números recibidos
    *Param:
    *numbers -> Objeto contenedor de los númenros a imprimir
    *quantity -> Cantidad de elementos a imprimir
    */
    public void printPrimeNumbers(int[] numbers, int quantity){
        int PAGENUMBER = 1;         
        int PAGEOFFSET = 1;
        int ROWOFFSET;
        int C;
        while (PAGEOFFSET <= quantity) {             
            System.out.print("The First ");             
            System.out.print(Integer.toString(quantity));             
            System.out.print(" Prime Numbers === Page ");             
            System.out.print(Integer.toString(PAGENUMBER));             
            System.out.println("\n");             
            for (ROWOFFSET=PAGEOFFSET; ROWOFFSET <= PAGEOFFSET+RR-1; ROWOFFSET++) {                 
                for (C = 0; C <= CC - 1; C++)                     
                    if (ROWOFFSET + C * RR <= quantity)                         
                    System.out.printf("%10d", numbers[ROWOFFSET + C * RR]);                 
                System.out.println();             
                
            }             
            System.out.println("\f");             
            PAGENUMBER++;             
            PAGEOFFSET += RR*CC; 
        }
    }
}
