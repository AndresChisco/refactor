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
public class Refactor {

    /**
     * @param args the command line arguments
     */
             
    
    public static void main(String[] args) {
        final int M = 1000;
        PrimeNumber numeros = new PrimeNumber();
        Printer printer = new Printer(4,50);
        System.out.println(numeros.setPrimeNumbers(M).length);
        printer.printPrimeNumbers(numeros.setPrimeNumbers(M), M);
    }
}
