/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02l05;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Ex02L05 {

    /**
     * @param args the command line arguments
     */
    public static class Equacao{
        private int A;
        private int B;
        private int C;
        private double Delta;
        private double x1;
        private double x2;
    
        public void setNum(int a, int b, int c){
        A = a;
        B = b;
        C = c;
        
        }
        Equacao(){
        A = 0;
        B = 0;
        C = 0;
        Delta = 0;
        x1 = 0;
        x2 = 0;
        
        }
        public double Delta(int A,int B, int C){
        Delta =  (B*B)- (4*A*C);
        return Delta;
        }
        
        public void Resultado(){
        if(Delta == 0 ){
            x1 = (-B + Math.sqrt(Delta))/(2*A);
            x2 = x1;
            JOptionPane.showMessageDialog(null," (" + A + ")x^2 + (" + B + ")x + (" + C + ") = \n x1 = "+ x1 + "\n x2 = " + x2 );
        }
         if(Delta < 0 ){
            JOptionPane.showMessageDialog(null,"Não existem valores reais como resultado");
        }
        if (Delta > 0){
            x1 = (-B + Math.sqrt(Delta))/(2*A);
            x2 = (-B - Math.sqrt(Delta))/(2*A);
            
            JOptionPane.showMessageDialog(null," (" + A + ")x^2 + (" + B + ")x + (" + C + ") = \n x1 = "+ x1 + "\n x2 = " + x2 );
        }
        }
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c;
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de A :"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de B :"));
        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de C :"));
        
        Equacao equa = new Equacao();
        equa.setNum(a,b,c);
        equa.Delta(a,b,c);
        equa.Resultado();
        
    }
    
}
