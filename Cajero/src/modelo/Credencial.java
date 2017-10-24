package modelo;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Charles Hurtado, Edwin Hastamorir
 */
public class Credencial {

    private int id;
    private String idTarjeta;
    private String clavePrivada;
    private int claveUsuario;
    private Date ocurrencia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getClavePrivada() {
        return clavePrivada;
    }

    public void setClavePrivada(String clavePrivada) {
        this.clavePrivada = clavePrivada;
    }

    public int getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(int claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public Date getOcurrencia() {
        return ocurrencia;
    }

    public void setOcurrencia(Date ocurrencia) {
        this.ocurrencia = ocurrencia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.id;
        hash = 31 * hash + Objects.hashCode(this.idTarjeta);
        hash = 31 * hash + Objects.hashCode(this.ocurrencia);
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
        final Credencial other = (Credencial) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Cajero{" + "id=" + id + ", idTarjeta=" + idTarjeta + ", clavePrivada=" + clavePrivada + ", claveUsuario=" + claveUsuario + ", ocurrencia=" + ocurrencia + '}';
    }

}
