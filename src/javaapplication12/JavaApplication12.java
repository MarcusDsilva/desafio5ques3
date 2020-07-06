/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int cod = 0;
    double valor, acDebito, asCredito;
    asCredito =0; acDebito=0; valor= 1;

    while(cod != 0){
          cod = Integer.parseInt(JOptionPane.showInputDialog("(1) debito," + "(2)crédito e (0)fim"));
           if(cod == 1 || cod == 2){
            valor = Double.parseDouble(JOptionPane.showInputDialog("informe o valor:"));
           if (cod == 1){
           acDebito = acDebito + valor;
           JOptionPane.showMessageDialog(null, "valor debitado");
           }else{
               acDebito = acDebito + valor;
               JOptionPane.showMessageDialog(null, "valor creditado");
           } if(cod==0){
                   JOptionPane.showMessageDialog(null, "fim do programa");
                   }else{
            JOptionPane.showMessageDialog(null, " codigo invalido");
           }
           }
    }

   }