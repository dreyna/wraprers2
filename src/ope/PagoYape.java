
package ope;

/**
 *
 * @author USER
 */
public class PagoYape extends PagoDecorador{
 
    public PagoYape(Pago pago) {
        super(pago);
    }
     @Override
    public void enviarMensaje(double monto) {
        super.enviarMensaje(monto); 
         pagoYape(monto);
    }
    
    private void pagoYape(double monto) {
        System.out.println("Se realizo el pago con Yape el monto de " + monto);
    }
}
