package modelo;

import java.util.ArrayList;
import java.util.List;
import procesos.Operacion;

/**
 *
 * @author Charles Hurtado, Edwin Hastamorir
 */
public class Cajero {
    private int idCajero;
    private double cantidadDisponible;
    private Credencial credencial;
    private List operaciones;
    private Operacion operacionSelec;
    private String direccion;

    public Cajero() {
        operaciones = new ArrayList<>();
    }

    public int getIdCajero() {
        return idCajero;
    }

    public void setIdCajero(int idCajero) {
        this.idCajero = idCajero;
    }

    public double getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(double cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public List getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(List operaciones) {
        this.operaciones = operaciones;
    }

    public Operacion getOperacionSelec() {
        return operacionSelec;
    }

    public void setOperacionSelec(Operacion operacionSelec) {
        this.operacionSelec = operacionSelec;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.idCajero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cajero other = (Cajero) obj;
        return this.idCajero == other.idCajero;
    }

    @Override
    public String toString() {
        return "Cajero{" + "idCajero=" + idCajero + ", cantidadDisponible=" + cantidadDisponible + ", credencial=" + credencial + ", operaciones=" + operaciones + ", operacionSelec=" + operacionSelec + ", direccion=" + direccion + '}';
    }
    
}
