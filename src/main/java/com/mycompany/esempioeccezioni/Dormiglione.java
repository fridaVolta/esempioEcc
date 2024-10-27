/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esempioeccezioni;

import java.util.concurrent.TimeUnit;

/**
 * esempio di eccezioni controllate, 
 * non possono non essere gestite
 * @author frida
 */
public class Dormiglione implements Runnable {
    @Override
    public void run() {
        try {
            //fa tre pisolini ciascuno di 5 secondi
            for (int i = 0; i < 3; i++) {
                System.out.println("Il Thread Pisolo fa il pisolino: " + i);
                TimeUnit.SECONDS.sleep(5);
            }
        } catch (InterruptedException e) {
            System.out.println("il Thread Pisolo e' stato interrotto in modo errato");
        }
    }
}