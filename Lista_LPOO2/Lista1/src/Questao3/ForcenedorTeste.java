/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao3;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ForcenedorTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fornecedor teste1 = new Fornecedor();
        
        teste1.setNome(JOptionPane.showInputDialog(null, "Qual seu nome ?", "Fornecedor", JOptionPane.INFORMATION_MESSAGE));
        teste1.setIdade(Integer.parseInt((JOptionPane.showInputDialog(null, "Qual sua idade ?", "Fornecedor", JOptionPane.INFORMATION_MESSAGE))));
        teste1.setAltura(Double.parseDouble((JOptionPane.showInputDialog(null, "Qual sua altura ?", "Fornecedor", JOptionPane.INFORMATION_MESSAGE))));
        teste1.setSexo(JOptionPane.showInputDialog(null, "Qual seu sexo ?", "Fornecedor", JOptionPane.INFORMATION_MESSAGE));
        teste1.setCreditoMaximo(Double.parseDouble((JOptionPane.showInputDialog(null,"Digite seu valor em credito","Fornecedor", JOptionPane.INFORMATION_MESSAGE))));
        teste1.setValorEmDivida(Double.parseDouble((JOptionPane.showInputDialog(null,"Digite o valor da sua divida","Fornecedor", JOptionPane.INFORMATION_MESSAGE))));

       JOptionPane.showMessageDialog(null,"Dados do Empregado : \n Nome: "+teste1.getNome()+"\n Idade : "+teste1.getIdade()+"\n Altura: "+teste1.getAltura()+"\n Sexo: "+teste1.getSexo()+"\n Credito: "+teste1.getCreditoMaximo()+"\n Divida:  "
               +teste1.getValorEmDivida()+"\n Difença de credito: "+teste1.obterSaldo() ,"vetor",JOptionPane.PLAIN_MESSAGE);
       teste1.obterSaldo();

    }
    
}
