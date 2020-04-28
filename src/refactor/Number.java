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
