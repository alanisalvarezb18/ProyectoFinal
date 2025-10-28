
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final_fundamentos_alanis.Controller;

import com.mycompany.proyecto_final_fundamentos_alanis.Vista.GUIElegirColor;
import com.mycompany.proyecto_final_fundamentos_alanis.Vista.GUIInicio;
import com.mycompany.proyecto_final_fundamentos_alanis.Vista.GUITablero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.classfile.instruction.SwitchCase;

/**
 *
 * @author alanisvaleria
 */
public class ControlladorTablero implements ActionListener {
    
    GUITablero gUITablero;
    
    public ControlladorTablero(){
        
    this.gUITablero = new GUITablero(this);
    this.gUITablero.setVisible(true);
    }
    
   

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "LanzarDado": 
                break;
            default:
                throw new AssertionError();
        }
   
    }
}
