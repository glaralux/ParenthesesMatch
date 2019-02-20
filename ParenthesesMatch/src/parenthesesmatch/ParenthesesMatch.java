/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parenthesesmatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Estuardo
 */
public class ParenthesesMatch {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args)throws IOException{
        int validarpop = 0;
        int validarpush=0;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String sIngreso;

     Pila ps = new Pila();

        System.out.println("Introdusca su cadena: ");
        sIngreso= buff.readLine();

        for(int iCont=0; iCont<sIngreso.length(); iCont++){

            System.out.println(sIngreso.charAt(iCont));
            if(sIngreso.charAt(iCont)=='{'){
                ps.push();
                validarpush++;
            }
            if(sIngreso.charAt(iCont)=='['){
                ps.push();
                validarpush++;
            }
            
            if(sIngreso.charAt(iCont)=='('){
                ps.push();
                validarpush++;
            }
            if(sIngreso.charAt(iCont)==')'){
                ps.pop();
                validarpop++;
            }
            if(sIngreso.charAt(iCont)==']'){
                ps.pop();
                validarpop++;
            }
            if(sIngreso.charAt(iCont)=='}'){
                ps.pop();
                validarpop++;
            }
            
        }
        if(ps.vacia()==true && validarpop == validarpush){
            System.out.println("Cadena esta balanceada");
        }
        
        else{
                System.out.println("Cadena no se encontre balanceada");
        }



    }

}
