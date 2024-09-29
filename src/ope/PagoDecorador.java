/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ope;

/**
 *
 * @author USER
 */
public abstract class PagoDecorador implements Pago{
    protected Pago pago;

    public PagoDecorador(Pago pago) {
        this.pago = pago;
    }
    
    
    @Override
    public void enviarMensaje(double monto) {
         pago.enviarMensaje(monto);
    }
}
