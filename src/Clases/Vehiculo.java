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
public class Vehiculo { 
    private String num_matricula,num_seguro,marca,modelo;
    int año;

    public Vehiculo(String num_matricula, String num_seguro, String marca, String modelo, int año) {
        this.num_matricula = num_matricula;
        this.num_seguro = num_seguro;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getNum_matricula() {
        return num_matricula;
    }

    public String getNum_seguro() {
        return num_seguro;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }
    
}
