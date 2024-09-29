package ope;

/**
 *
 * @author USER
 */
public class PagoTarjeta extends PagoDecorador{
     public PagoTarjeta(Pago pago) {
        super(pago);
    }
     @Override
    public void enviarMensaje(double monto) {
        super.enviarMensaje(monto); 
         pagoTarjeta(monto);
    }
    
    private void pagoTarjeta(double monto) {
        System.out.println("Se realizo el pago con Tarjeta el monto de " + monto);
    }
}
