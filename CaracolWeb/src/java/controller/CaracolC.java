/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Servicio.CaracolS;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author PC
 */
@Named(value = "caracolControl")
@Dependent
public class CaracolC {

    /**
     * Creates a new instance of CaracolC
     */
    private int altura;
    private int sube;
    private int baja;
    private String rpta;
    int avance = 0, days = 0;

    public void calcular(){     
        rpta = CaracolS.calcular(altura, sube, baja);
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getSube() {
        return sube;
    }

    public void setSube(int sube) {
        this.sube = sube;
    }

    public int getBaja() {
        return baja;
    }

    public void setBaja(int baja) {
        this.baja = baja;
    }

    public String getRpta() {
        return rpta;
    }

    public void setRpta(String rpta) {
        this.rpta = rpta;
    }

    public CaracolC() {
    }

}
