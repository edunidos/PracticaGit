/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import ejercicionif.Nif;

/**
 *
 * @author dam128
 */
public class Coche extends Vehiculo{
    private String color,extras;
    private Neumatico_coche_furgo rueda_coche;
    private int puertas;

    public Coche(String num_matricula, String num_seguro, String marca, String modelo, int año, Nif propietario, String color, String extras, Neumatico_coche_furgo rueda_coche, int puertas) {
        super(num_matricula, num_seguro, marca, modelo, año, propietario);
        this.color= color;
        this.extras=extras;
        this.rueda_coche= rueda_coche;
        this.puertas= puertas;
    }

    public String getColor() {
        return color;
    }

    public String getExtras() {
        return extras;
    }

    public Neumatico_coche_furgo getRueda_coche() {
        return rueda_coche;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRueda_coche(Neumatico_coche_furgo rueda_coche) {
        this.rueda_coche = rueda_coche;
    }

   
}
