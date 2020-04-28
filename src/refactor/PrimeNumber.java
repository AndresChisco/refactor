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
public class PrimeNumber extends Number {
    
    final int ORDMAX = 30;
    int C;
    
    public void Primenumber(){
        
    }
    
    public int[] setPrimeNumbers(int M)
    {   
        int P[] = new int[M+1];
        P[1] = 2;
        boolean JPRIME;         
        int ORD = 2;         
        int SQUARE = 9;         
        int N = 0;
        int J = 1;         
        int K = 1;    
        int MULT[] = new int[ORDMAX+1];
        while (K < M) {             
            do {                 
                J += 2;                 
                if( J == SQUARE) {                     
                    ORD++;                     
                    SQUARE=P[ORD]*P[ORD];                     
                    MULT[ORD-1]=J;
                }                 
                N=2;                 
                JPRIME=true;                 
                while (N < ORD && JPRIME) {                     
                    while (MULT[N]<J)                       
                        MULT[N] += P[N] + P[N];
                    if(MULT[N] == J)
                        JPRIME=false;
                    N++;
                }
            } while (!JPRIME);             
            K++;             
            P[K]=J;
        }
        return P;
    }
}
