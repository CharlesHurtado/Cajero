package procesos;

import modelo.Credencial;

/**
 *
 * @author Charles Hurtado, Edwin Hastamorir
 */
public interface Operacion {
    /**
     * Método para realizar la aprobación de la operación, usando la credencial
     * obtenida.
     * @param credencial
     * @return true si esta aprobado, false si no.
     */
    public boolean aprobarTransaccion(Credencial credencial);
    /**
     * Método que ejecuta la operación.
     * @return true si se pudo ejecutar el proceso, false si no se pudo ejecutar.
     */
    public boolean ejecutar();
    /**
     * Porporciona el ID de la operación.
     * @return 
     */
    public int getId();
    /**
     * Proporciona el nombre de la operación.
     * @return 
     */
    public String getNombre();
}
