/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.mycompany.proyectofundamentos.vista.GUIInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPrincipal implements ActionListener {

    GUIInicio gUIInicio;

    public ControladorPrincipal() {
        this.gUIInicio = new GUIInicio(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == this.gUIInicio.getBtnPlay()) {
            System.out.println("Boton de Jugar presionado");
        } else if (e.getActionCommand() == this.gUIInicio.getBtnHistoria()) {
            System.out.println("Boton de Historia Presionado");
        } else if (e.getActionCommand() == this.gUIInicio.getBtnInstrucciones()) {
            System.out.println("Boton de Instrucciones presionado");
        } else if (e.getActionCommand() == this.gUIInicio.getBtnCreditos()) {
            System.out.println("Boton de Creditos presionado");
        } else if (e.getActionCommand() == this.gUIInicio.getColorVerde()) {
            System.out.println("Color verde Seleccionado");
        } else if (e.getActionCommand() == this.gUIInicio.getColorAzul()) {
            System.out.println("Color Azul Seleccionado");
        } else if (e.getActionCommand() == this.gUIInicio.getColorRojo()) {
            System.out.println("Color Rojo Seleccionado");
        } else if (e.getActionCommand() == this.gUIInicio.getColorAmarillo()) {
            System.out.println("Color Amarillo Seleccionado");}
        }
    }
