/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final_fundamentos_alanis.Controller;

import com.mycompany.proyecto_final_fundamentos_alanis.Vista.GUIElegirColor;
import com.mycompany.proyecto_final_fundamentos_alanis.Vista.GUIInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.classfile.instruction.SwitchCase;

/**
 *
 * @author alanisvaleria
 */
public class ControlladorPrincipal implements ActionListener {
    
    GUIInicio gUIInicio;
    
    public ControlladorPrincipal(){
        
    this.gUIInicio = new GUIInicio(this);
    this.gUIInicio.escuchar(this);
    this.gUIInicio.setVisible(true);
    }
    
   

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Jugar":
                new ControlladorElegirColor();
                break;
            case "Historia":
                new ControlladorHistoria();
                break;
            case "Creditos": 
                new ControlladorCreditos();
                break;
            case "Salir": 
                System.exit(0);
                break;
            default:
                throw new AssertionError();
        }
   
    }
}
