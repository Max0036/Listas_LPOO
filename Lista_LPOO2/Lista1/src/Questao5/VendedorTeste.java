/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao5;

import javax.swing.JOptionPane;

/**
 *
 * @author adilson
 */
public class VendedorTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vendedor vend = new Vendedor();
        
        vend.setNome(JOptionPane.showInputDialog(null, "Qual seu nome ?", "Vendedor", JOptionPane.INFORMATION_MESSAGE));
        vend.setIdade(Integer.parseInt((JOptionPane.showInputDialog(null, "Qual sua idade ?", "Vendedor", JOptionPane.INFORMATION_MESSAGE))));
        vend.setAltura(Double.parseDouble((JOptionPane.showInputDialog(null, "Qual sua altura ?", "Vendedor", JOptionPane.INFORMATION_MESSAGE))));
        vend.setSexo(JOptionPane.showInputDialog(null, "Qual seu sexo ?", "Vendedor", JOptionPane.INFORMATION_MESSAGE));
        vend.setValorVendas(Double.parseDouble(JOptionPane.showInputDialog(null,"Qual o valor das vendas ?", "Vendedor", JOptionPane.INFORMATION_MESSAGE)));
        vend.setPorcentagem(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a porcentagem da comissão", "Vendedor", JOptionPane.INFORMATION_MESSAGE)));
        
        
        JOptionPane.showMessageDialog(null,"DADOS DO EMPREGADO "+"\n"+"Nome: "+vend.getNome()+"\n"+"Idade: "+vend.getIdade()+"\n"+"Sexo: "+vend.getSexo()+"\n"+"Altura: "+vend.getAltura()+"Lucros do Vendedor: "+vend.getComissao());
        vend.obterLucros();
    }
    
}
