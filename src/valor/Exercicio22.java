/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valor;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 31437974
 */
public class Exercicio22 {
    public Exercicio22() {
        
   System.out.println("Escolha um das opções no menu \n1-Solteiro(a) \n2-Desquitado(a) \n3-Casado(a) \n4-Divorciado(a) \n5-Viuvo(a)");
   Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        int op = Integer.parseInt(entrada);
        String resposta = "zuado";
        do {
   switch (op){
          case 1: 
              resposta = "solteiro(a)";
              break;
          case 2: 
              resposta = "desquitado(a)";   
              break;
              
          case 3: 
              resposta = "casado(a)";
              break;
              
          case 4:
              resposta = "divorciado(a)";
              break;
              
          case 5: 
              resposta = "viuvo(a)";
              break;
          default:
              resposta = "zuado";
           break;   
         
   }
   
   }while(resposta.equals("zuado"));       
        
 
             
           
           
              
                      
                     
      
    }
    
}
