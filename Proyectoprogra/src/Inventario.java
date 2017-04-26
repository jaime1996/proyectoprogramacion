
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaime
 */
public class Inventario {
    private ArrayList<Producto> productos;
    
    
    public Inventario(){
        this.productos=new ArrayList<Producto>();
    }
    public void agregarProducto(Producto prod){
        productos.add(prod);
    }
    public void eliminarProducto(Producto prod){
        productos.remove(prod);
    }
    
    public Producto getProducto(int index){
        return(Producto)productos.get(index);
    }
    public int retDimension(){
        return productos.size();
    }
    
}
