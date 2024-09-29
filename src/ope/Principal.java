/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ope;

/**
 *
 * @author USER
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pago pago = new PagoBasico();
        pago = new PagoTarjeta(pago);
        pago = new PagoYape(pago);
        pago.enviarMensaje(200);
                
    }
    
}
