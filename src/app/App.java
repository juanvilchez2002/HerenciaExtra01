/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import service.AlquilerService;


public class App {

    
    public static void main(String[] args) {
        
        AlquilerService as = new AlquilerService();
        as.crearAlquiler();
        as.costoAlquiler();
        
    }
    
}
