package cajero;

import modelo.Cajero;
import procesos.OperExterna.OperCompras;
import procesos.OperInterna.OperCuenta;

/**
 *
 * @author Charles Hurtado, Edwin Hastamorir
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
    public void iniciar(){
        Cajero cajero = new Cajero();
        cajero.setIdCajero(1);
        cajero.setDireccion("Calle con carrera");
        cajero.setCantidadDisponible(35000000);
        
        cajero.getOperaciones().add(new OperCuenta(1, "Consulta saldo"));
        cajero.getOperaciones().add(new OperCuenta(2, "Retirar dinero"));
        cajero.getOperaciones().add(new OperCuenta(3, "Ingresar dinero"));
        cajero.getOperaciones().add(new OperCompras(4, "Compra tiquetes"));
        cajero.getOperaciones().add(new OperCompras(5, "Compra entradas teatro"));
        
        System.out.println(cajero.toString());
        
    }
}
