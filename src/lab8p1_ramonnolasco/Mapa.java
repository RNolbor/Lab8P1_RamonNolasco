/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_ramonnolasco;

/**
 *
 * @author ramon
 */
public class Mapa {
    private String nombre;
    private int rounds;

    public Mapa(String nombre, int rounds) {
        this.nombre = nombre;
        this.rounds = rounds;
    }

    public String toString() {
        return nombre + " - Rounds: " + rounds;
    }

    public int getNumRounds() {
        return rounds;
    }
}
