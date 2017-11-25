/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao1;

import javax.swing.JOptionPane;

/**
 *
 * @author Max
 */
public class CockerTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cocker teste = new Cocker ();
      teste.setNome(JOptionPane.showInputDialog(null,"Qual o nome do cachorro ?","Teste",JOptionPane.INFORMATION_MESSAGE));
      teste.setCor(JOptionPane.showInputDialog(null,"Qual a cor do cachorro ?","Teste",JOptionPane.INFORMATION_MESSAGE));
      teste.setTipo(JOptionPane.showInputDialog(null,"Qual o tipo do cachorro ?","Teste",JOptionPane.INFORMATION_MESSAGE));
      teste.setRaca(JOptionPane.showInputDialog(null,"Qual a raca nome do cachorro ?","Teste",JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(null,teste);
    }
    
}
