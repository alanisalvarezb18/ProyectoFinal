/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final_fundamentos_alanis.Modelo;

/**
 *
 * @author alanisvaleria
 */
public class Dado {
    
    private int numero;
    
    public Dado(){
    }
    
    public void LanzarDado() {
        numero = (int) (Math.random() * 6 )+   1 ;
    }

    public int getValor() {
        return numero;
    }

    @Override
    public String toString() {
        return "El numero es: " +numero;
    }
    
}
