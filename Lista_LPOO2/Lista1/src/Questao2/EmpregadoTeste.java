/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao2;

import javax.swing.JOptionPane;

/**
 *
 * @author Max
 */
public class EmpregadoTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empregado teste = new Empregado();
        teste.setNome(JOptionPane.showInputDialog(null, "Qual seu nome ?", "TesteEmp", JOptionPane.INFORMATION_MESSAGE));
        teste.setIdade(Integer.parseInt((JOptionPane.showInputDialog(null, "Qual sua idade ?", "TesteEmp", JOptionPane.INFORMATION_MESSAGE))));
        teste.setAltura(Double.parseDouble((JOptionPane.showInputDialog(null, "Qual sua altura ?", "TesteEmp", JOptionPane.INFORMATION_MESSAGE))));
        teste.setSexo(JOptionPane.showInputDialog(null, "Qual seu sexo ?", "TesteEmp", JOptionPane.INFORMATION_MESSAGE));
        teste.setSalario(Float.parseFloat((JOptionPane.showInputDialog(null, "Qual seu Salario ?", "TesteEmp", JOptionPane.INFORMATION_MESSAGE))));
        JOptionPane.showMessageDialog(null,"Dados do Empregado : "+teste.getNome()+","+teste.getIdade()+","+teste.getAltura()+","+teste.getSexo()+","+teste.getSalario(),"vetor",JOptionPane.PLAIN_MESSAGE);

    }

}
