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
public class Motocicleta extends Vehiculo{
private int num_ruedas;
private Neumatico_moto rueda_moto;
    public Motocicleta(String num_matricula, String num_seguro, String marca, String modelo, int año, Nif propietario, int num_ruedas,Neumatico_moto rueda_moto) {
        super(num_matricula, num_seguro, marca, modelo, año, propietario);
        this.num_ruedas=num_ruedas;
        this.rueda_moto=rueda_moto;
    }

    public int getNum_ruedas() {
        return num_ruedas;
    }

    public void setRueda_moto(Neumatico_moto rueda_moto) {
        this.rueda_moto = rueda_moto;
    }

    public Neumatico_moto getRueda_moto() {
        return rueda_moto;
    }
    
}
