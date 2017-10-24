/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos.OperExterna;

import java.util.ArrayList;
import java.util.List;
import modelo.Credencial;
import procesos.OperExterna.compras.Articulo;
import procesos.Operacion;

/**
 *
 * @author Estudiantes
 */
public class OperCompras implements Operacion {
    private int id;
    private String nombre;
    private List carrito;
    private List catalogo;

    public OperCompras() {
        inicializar();
    }
    public OperCompras(int id, String nombre) {
        inicializar();
        this.id = id;
        this.nombre = nombre;
    }
    private void inicializar(){
        carrito = new ArrayList<>();
        catalogo = new ArrayList<>();
    }
    
    public void consultarCatalogo(){
        
    }
    public float obtenerTotalAPagar(){
        return 0f;
    }
    public void quitarArticulo(Articulo articulo){
        
    }
    public void seleccionarArticulo(Articulo articulo){
        
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

    public List getCatalogo() {
        return catalogo;
    }
    
}
