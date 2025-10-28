/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final_fundamentos_alanis.Modelo;

import java.util.ArrayList;

/**
 *
 * @author alanisvaleria
 */
public class Tablero {
    
    private ArrayList<Casilla> Casilla;

    public Tablero(ArrayList<Casilla> Casilla) {
        this.Casilla = Casilla;
    }

    
    public Tablero() {
        this.Casilla = new ArrayList();
        crearTablero();
    }
    
    private void crearTablero(){
    this.Casilla.add(new Casilla(12,22, 44, 55));
    
    }
}
