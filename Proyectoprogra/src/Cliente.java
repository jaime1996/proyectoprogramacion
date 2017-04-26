
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
public class Cliente {
    private String Nombrecliente;
    private double rutcliente;
    private int cantidad;
    private char miretiro;
    private Despacho despacho;
   
    private Producto miproducto;
   

    public Cliente(String Nombrecliente, double rutcliente,int cantidad) {
        this.Nombrecliente = Nombrecliente;
        this.rutcliente = rutcliente;
        
        this.cantidad=cantidad;
        
    }
    
    public Cliente(String Nombrecliente, double rutcliente,int cantidad,char miretiro){
        this.Nombrecliente = Nombrecliente;
        this.rutcliente = rutcliente;
        this.cantidad=cantidad;
        this.miretiro=miretiro;
    }
    public int getCantidad(){
        return cantidad;
    }
    
    public void asociarProducto(Producto miprod){
        
       this.miproducto=miprod;
    }
    
    
    public Producto getProducto(){
        return miproducto;
    }
    
    public int retiro(){
        despacho=new Despacho(this.miretiro);
        return despacho.getEjecucion();
        
    }
    
    
    
    
    
}
