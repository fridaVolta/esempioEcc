/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.esempioeccezioni;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * classe che simula le due categorie di eccezioni:
 * non controllate e controllate
 * @author frida
 */
public class EsempioEccezioni {
    /**
     * metodo principale
     * @param args
     */
    public static void main(String[] args) {
        /* esempio di eccezione controllata
        non può non essere gestita con un blocco try -catch*/
        Dormiglione pisolo= new Dormiglione();
        Thread pisoloThread= new Thread(pisolo);
        pisoloThread.start(); 
        for(int i=0;i<50;i++) {
            System.out.println("Cerco di svegliare pisolo "+ 
                    "per la " + i+"-esima volta"); 
            /*NB: il thread dormiglione non può essere interrotto mentre
            sta dormendo!! (cioè è in sleep); esso potrebbe interrompersi
            solo se fosse sveglio innanzitutto e se avesse nel metodo
            run() un meccanismo di controllo !Thread.interrupted()
            che verifica se è stato settato il flag "interrotto"*/
            pisoloThread.interrupt();
        }
        /* esempio di eccezione non controllata, 
        può non essere gestita con un blocco try -catch
        ma se poi va in errore comporta l'interuzione 
        non gestita di tutta l'app*/
//        int num = 8;        
//        try {
//            for (int i = 3; i >= 0; i--) {
//                System.out.println("risultato: " + (num / i));
//                System.out.println("divisione per" + i);
//            }
//        } catch (ArithmeticException e1) {
//            System.out.println(e1.toString());
//            Logger.getLogger(EsempioEccezioni.class.getName()).log(Level.SEVERE, e1.toString(), e1);
//        } finally {
//            System.out.println("le operazioni nel finally le fa cmq, "+
//                    "sia che ci sia l'eccezione, sia che tutto vada bene");
//        }
        
        System.out.println("applicazione terminata correttamente");
    }
}
