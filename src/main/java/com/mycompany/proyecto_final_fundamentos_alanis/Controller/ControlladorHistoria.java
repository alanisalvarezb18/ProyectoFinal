/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final_fundamentos_alanis.Controller;

import com.mycompany.proyecto_final_fundamentos_alanis.Vista.GUIHistoria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alanisvaleria
 */
public class ControlladorHistoria implements ActionListener {
    private GUIHistoria gUIHistoria;
    
    public ControlladorHistoria (){
    this.gUIHistoria = new GUIHistoria(this);
    this.gUIHistoria.setVisible(true);
    this.gUIHistoria.escuchar(this);}

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Menu":
                this.gUIHistoria.dispose();
                break;
        }
 
    }
}
