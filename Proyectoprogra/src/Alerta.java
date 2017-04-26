/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaime
 */
public class Alerta {
    private String mensaje;
    
    public void definirMensaje(int cantidad){
        if(cantidad>20){
            mensaje="alta disponiblidad";
        }
        if(cantidad<=20 && cantidad>=10){
            mensaje="disponiblidad media";
        }
        if(cantidad<10){
            mensaje="baja disponiblidad";
        }
    }
    
    public String getMensaje(){
        return mensaje;
    }
    
}
