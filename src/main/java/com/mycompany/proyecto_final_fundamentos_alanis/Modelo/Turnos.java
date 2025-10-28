/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final_fundamentos_alanis.Modelo;

/**
 *
 * @author alanisvaleria
 */
public class Turnos {
   
    private String turno;
    
    public Turnos(){
    this.turno = "Sombra";}
    
    public void cambiarTurno(){
    if (turno.equals("Luna")){
    turno= "Sombra";
      }
    
    else if(turno.equals("Sombra")) { turno= "Luna";
       }
    }
    
    public String JugadorActual(){
    return "Turno de: "+turno;}
    
}
