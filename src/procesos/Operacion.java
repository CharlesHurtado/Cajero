package procesos;

import modelo.Credencial;

/**
 *
 * @author Charles Hurtado, Edwin Hastamorir
 */
public interface Operacion {
    /**
     * 
     * @param credencial
     * @return 
     */
    public boolean aprobarTransaccion(Credencial credencial);
    /**
     * 
     * @return 
     */
    public boolean ejecutar();
    /**
     * 
     * @return 
     */
    public int getId();
    /**
     * 
     * @return 
     */
    public String getNombre();
}
