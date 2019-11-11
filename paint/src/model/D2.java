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
public abstract class D2 extends D0{
    private Color corInterna;
    private double area;
    

    public D2(Color cor, double area, double perimetro, int x, int y) {
        super(x, y);
        this.corInterna = cor;
    }//fim construtor D2
    public double perimetro(){return 2*(base)  }
}//fim class D2
