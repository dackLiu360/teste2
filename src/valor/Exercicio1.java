/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valor;

import javax.swing.JOptionPane;

/**
 *
 * @author 31437974
 */
public class Exercicio1 {
private double preco; 
private int codigo;
    public Exercicio1() {
preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto: "));

if(codigo==1)
        preco+=preco*0.10;

else
if(codigo==3)
        preco+=preco*0.25;

else
if(codigo==4)
       preco+=preco*0.30;

else
if(codigo==8)
    preco+=preco*0.50;

else
    System.exit(0);


JOptionPane.showMessageDialog(null,"Seu preço é de: " + preco);
    }
    }
    
    

