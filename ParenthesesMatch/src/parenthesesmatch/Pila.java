/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parenthesesmatch;

/**
 *
 * @author Estuardo
 */
public class Pila {
    
  int iTope=-1;
    char caracteres[];

    Pila(){
        int max=5;
        caracteres=new char[max];
    }
    public boolean llena(){
        if(iTope==caracteres.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean vacia(){
        if(iTope==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(){
        char dato = 0;
        if(llena()==true){
            System.out.print("Overflow");
        }
        else{
            iTope++;
            caracteres[iTope]=dato;
        }
    }
    public char pop(){
        char aux = 0;
        if(vacia()==true){
            System.out.println("Empty");
        }
        else{
            aux = caracteres[iTope];
            iTope--;
        }
        return aux;
    }

}

