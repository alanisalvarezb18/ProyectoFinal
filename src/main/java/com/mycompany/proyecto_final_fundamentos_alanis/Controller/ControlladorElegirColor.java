/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final_fundamentos_alanis.Controller;

import com.mycompany.proyecto_final_fundamentos_alanis.Vista.GUIElegirColor;
import com.mycompany.proyecto_final_fundamentos_alanis.Vista.GUITablero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alanisvaleria
 */
public class ControlladorElegirColor implements ActionListener{
    private GUIElegirColor gUIElegirColor;
    private String eleccion = "verde";
    
    public ControlladorElegirColor(){
    this.gUIElegirColor = new GUIElegirColor(this);
    this.gUIElegirColor.escuchar(this);
    this.gUIElegirColor.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Conejo":
                new ControlladorTablero();
                break;
            case "Oso":
                new ControlladorTablero();            
                break;
            case "Pato":
                new ControlladorTablero();
                break;
            case "Ciervo":
                new ControlladorTablero();
                break;
            case "Menu":
                this.gUIElegirColor.dispose();
                break;
                
        }
    
    }
    

}
