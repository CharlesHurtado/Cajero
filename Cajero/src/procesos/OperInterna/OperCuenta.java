package procesos.OperInterna;

import modelo.Credencial;
import procesos.Operacion;

/**
 *
 * @author Charles Hurtado, Edwin Hastamorir
 */
public class OperCuenta implements Operacion {
    private int id;
    private String nombre;

    public OperCuenta() {
    }

    public OperCuenta(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public void cambiarClaveUsuario(String clave){
        
    }
    public float consultarSaldo(){
        return 0f;
    }
    public void ingresarDinero(float monto){
        
    }
    public boolean sacarDinero(float monto){
        return false;
    }
    
    @Override
    public boolean aprobarTransaccion(Credencial credencial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ejecutar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
