/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01l05;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Ex01L05 {

    /**
     * @param args the command line arguments
     */
    public static class Triangulo {
       private double base;
       private double area;
       private double altura;
      
    public void setBaseAltura(double ba, double al){
        base = ba;
        altura = al;
    }
 
      
     
    Triangulo() {
        base = 0;
        area = 0;
        altura = 0;
    }
      
    public  double getArea(){
        area = (base*altura)/2;
        return area;
    }  
   
}
 
   

    public static void main(String[] args) {
        // TODO code application logic here
        
        double a, b, area;
      
       b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base:"));
       a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura:"));
       Triangulo tri = new Triangulo();
       tri.setBaseAltura(b, a);
       JOptionPane.showMessageDialog(null,"A area é = " + tri.getArea());
    }
    
}
