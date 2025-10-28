/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final_fundamentos_alanis.Controller;

import com.mycompany.proyecto_final_fundamentos_alanis.Vista.GUICreditos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alanisvaleria
 */
public class ControlladorCreditos implements ActionListener{
    
    private GUICreditos gUICreditos;
    
    public ControlladorCreditos (){
    this.gUICreditos = new GUICreditos(this);
   this.gUICreditos.setVisible(true);
    this.gUICreditos.escuchar(this);}

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case"Menu":
                this.gUICreditos.dispose();
                break;
        }
    
    }
    
}
