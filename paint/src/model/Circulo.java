/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;

/**
 *
 * @author 09795410695
 */
public class Circulo extends D2{
    private double raio;

    public Circulo(double raio, Color cor, double area, double perimetro, int x, int y) {
        super(cor, area, perimetro, x, y);
        this.raio = raio;
    }//fim construtor Circulo 
    
}//fim class Circulo
