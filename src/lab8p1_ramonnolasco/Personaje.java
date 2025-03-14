/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_ramonnolasco;


/**
 *
 * @author ramon
 */
public class Personaje {
    private String nombre;
    private String rol;
    private int vida;
    private int vidaMax;
    private int daño;

    public Personaje(String nombre, String rol, int vida, int vidaMax, int daño){
        this.nombre = nombre;
        this.rol = rol.toUpperCase();
        this.vida = vida;
        this.vidaMax = vida;
        this.daño = daño;
    }



    public String toString(){
        return nombre + " (" + rol + ") - Vida: " + vida + ", Danio: " + daño;
    }
    
    public String getRol(){
        return rol;
    }

    public int getVida(){
        return vida;
    }

    public int getDaño(){
        return daño;
    }
     
    public void recibirDanio(int danioRecibido){
        vida -= danioRecibido/2;
        if (vida < 0) vida = 0;
    }

    public void curar(int cantidad){
        vida += cantidad;
        if (vida > vidaMax){
            vida = vidaMax;
        }
        
    } 
    
}
