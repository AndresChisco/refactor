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
        // TODO code application logic here
        final int M = 1000;         
        final int RR = 50;         
        final int CC = 4;
        PrimeNumber numeros = new PrimeNumber();
        //numeros.setPrimeNumbers(M).length;
        System.out.println(numeros.setPrimeNumbers(M).length);
    }
}
