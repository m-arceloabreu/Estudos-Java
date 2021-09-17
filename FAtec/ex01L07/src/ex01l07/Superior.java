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
public class Superior {
    double N1;  // nota da P1
    double N2; // nota da P2
    double N3;  // nota da P3
    double media;
    
    
    
   
    
  Superior(){
      N1 = 0;
      N2 = 0;
      N3 = 0;
     media = 0;
  }
  public void setNotas (double n1, double n2, double n3){
      N1 = n1;
      N2 = n2;
      N3 = n3;
  }
  public double getMedia(){
  media =(double)( N1*0.35 +N2*0.5+N3*0.15);
  return media;
  }
}
