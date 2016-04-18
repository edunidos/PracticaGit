/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author dam128
 */
public class Neumatico_moto {
    private int pulgadas,grosor;
    private String dibujo;

    public Neumatico_moto(int pulgadas, int grosor, String dibujo) {
        this.pulgadas = pulgadas;
        this.grosor = grosor;
        this.dibujo = dibujo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public int getGrosor() {
        return grosor;
    }

    public String getDibujo() {
        return dibujo;
    }
    
}
