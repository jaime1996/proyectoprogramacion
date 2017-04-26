
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaime
 */
public class NewMain {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        String []nombre=new String [1];
        double[]rut=new double[1];
        int[]micantidad=new int[1];
        char retiro[]=new char[1];
        int producto[]=new int[1];
        
        String []marca=new String[2];
        String []descripcion=new String[2];
        int[]cantidad=new int[2];
        
        for(int i=0;i<marca.length;i++){
            System.out.println("Ingrese marca para el producto "+(i+1));
            marca[i]=leer.next();
            System.out.println("Ingrese descripcion");
            descripcion[i]=leer.next();
            System.out.println("Ingrese cantidad");
            cantidad[i]=leer.nextInt();
        }
        
        for(int i=0;i<nombre.length;i++){
            System.out.println("ingrese nombre cliente");
            nombre[i]=leer.next();
            System.out.println("ingrese rut");
            rut[i]=leer.nextDouble();
            System.out.println("eliga producto  0:producto1   1:producto2");
            producto[i]=leer.nextInt();
            System.out.println("Ingrese cantidad a comprar");
            micantidad[i]=leer.nextInt();
            System.out.println("Ingrese si retira o no  d:si  n:no");
            retiro[i]=leer.next().charAt(0);
            
        }
        Inventario inventario1=new Inventario();

        Producto producto1=new Producto(marca[0],descripcion[0],cantidad[0]);
        Producto producto2=new Producto(marca[1],descripcion[1],cantidad[1]);
        
        inventario1.agregarProducto(producto1);
        inventario1.agregarProducto(producto2);
        
        Cliente cliente1=new Cliente(nombre[0],rut[0],micantidad[0],retiro[0]);
        cliente1.asociarProducto(inventario1.getProducto(producto[0]));
        
        inventario1.getProducto(producto[0]).restarCantidad(cliente1.getCantidad(),cliente1.retiro());
        
        for(int i=0;i<inventario1.retDimension();i++){
            System.err.println("producto "+i);
            System.out.println(inventario1.getProducto(i).getCantidad());
            inventario1.getProducto(i).getMensaje();
           
        }
        
        
        
    }
    
}
