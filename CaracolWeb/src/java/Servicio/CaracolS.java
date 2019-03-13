/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

/**
 *
 * @author PC
 */
public class CaracolS {
  
    public static String calcular(int altura, int sube, int resbala) {
        int avance =0, days=0;
        String rpta=validar(altura, sube, resbala);
        if (rpta.length()==0) return rpta;
        while (avance < altura) {
            avance += sube;
            days++;
            if (avance >= altura) {
                break;
            }
            avance -= resbala;
        }
        rpta = "Tardará " + days + " dias en llegar a la meta";
        return rpta;
    }
    
    public static String validar(int altura,int subida, int bajada){
        String mensaje="";
        if(bajada >= subida){
            mensaje = "Ingresa un nro. menor que la subida";
        }else if(subida >= altura){
            mensaje = "Ingresa un nro. menor que la altura";
        }
        return mensaje;
    }
}
