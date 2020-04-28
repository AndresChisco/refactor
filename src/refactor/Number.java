/*
 * Clase padre Number (números) permitiría definir las propiedades generales de los números
 */
package refactor;

/**
 *
 * @author Andres
 */
public class Number {
    
    int value;
    
    public Number(){}
    
    public Number(int value){
        this.value = value;
    }
    
    public double getNumber(){
        return this.value;
    }
    
    public void setNumber(int value){
        this.value = value;
    }
}
