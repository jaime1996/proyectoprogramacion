/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaime
 */
public class Producto {
    private String marca;
    private String descripcion;
    private int cantidad;
    private Alerta alerta1;

    public Producto(String marca,String descripcion,int cantidad){
        this.marca=marca;
        this.descripcion=descripcion;
        this.cantidad=cantidad;
    }
   
    public void agregarCantidad(int cantidad) {
        this.cantidad = this.cantidad+cantidad;
    }
    public void restarCantidad(int cantidad,int ejecucion){
        if(ejecucion==0)
        {
            this.cantidad=this.cantidad-cantidad;
        }
        
        
    }
    public String getMarca() {
        return marca;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public int getCantidad() {
        return this.cantidad;
    }
    public String mensaje(){
        alerta1=new Alerta();
        alerta1.definirMensaje(this.cantidad);
        return alerta1.getMensaje();
    
    }
    
    public void getMensaje(){
        System.out.println(mensaje());
    }
    
    
    
    
    
}
