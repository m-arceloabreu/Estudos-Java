/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01l07;

/**
 *
 * @author marcelo
 */
public class Tecnico  extends Superior{
    @Override
    public double getMedia(){
        media = (N1 + N2*2 + N3*2)/5;
        return media;
    }
}
