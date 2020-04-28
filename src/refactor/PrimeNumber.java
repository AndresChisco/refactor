/*
 * Clase Hija PrimeNumber (números primos) permite escalar las propiedades unicas de los números primos
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
    
    /*
    * Función que establece la cantidad de números primos solicitados,
    * al usar el parámetro quantity la podemos reutilizar
    */
    public int[] setPrimeNumbers(int quantity)
    {   
        int P[] = new int[quantity + 1];
        P[1] = 2;
        boolean JPRIME;         
        int ORD = 2;         
        int SQUARE = 9;         
        int N = 0;
        int J = 1;         
        int K = 1;    
        int MULT[] = new int[ORDMAX+1];
        while (K < quantity) {             
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
