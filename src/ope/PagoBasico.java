/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ope;

/**
 *
 * @author USER
 */
public class PagoBasico implements Pago{

    @Override
    public void enviarMensaje(double monto) {
        System.out.println("Iniciando el pago de "+monto);
    }
    
}
