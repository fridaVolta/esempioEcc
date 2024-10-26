/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.esempioeccezioni;

/**
 *
 * @author frida
 */
public class EsempioEccezioni {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int num=8;
        
        try{
        for(int i=3; i>=0; i--){
              
            
            System.out.println("risultato: "+(num/i));
            System.out.println("divisione per"+i);
        }
        }catch(ArithmeticException e1){
            System.out.println(e1.toString());
            //Logger.getLogger(EsempioEccezioni.class.getName()).log(Level.SEVERE, null, ei);
        }finally{
            System.out.println("queste operazioni le fa cmq");
        }
    }
}
