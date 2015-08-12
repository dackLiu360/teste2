/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valor;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 31437974
 */

public class Exercicio2 {
private int op;
    public Exercicio2() {
List<String> optionList = new ArrayList<String>();
optionList.add("1");
optionList.add("2");
optionList.add("3");
optionList.add("4");
optionList.add("5");

Object[] options = optionList.toArray();
int value = JOptionPane.showOptionDialog(null,"Escolha um das opções no menu \n 1-Solteiro(a) \n2-Desquitado(a) \n3-Casado(a) \n4-Divorciado(a) \n5-Viuvo(a)",
                "Esta é a opção: ",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,options,optionList.get(0));

String opt = optionList.get(value);    
    JOptionPane.showMessageDialog(null,"Você escolheu: " + opt);
    }
}
