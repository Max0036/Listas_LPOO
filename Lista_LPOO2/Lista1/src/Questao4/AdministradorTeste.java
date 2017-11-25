/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao4;

import javax.swing.JOptionPane;

/**
 *
 * @author adilson
 */
public class AdministradorTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Administrador admin = new Administrador();
        admin.setNome(JOptionPane.showInputDialog(null, "Qual seu nome ?", "Administrador", JOptionPane.INFORMATION_MESSAGE));
        admin.setIdade(Integer.parseInt((JOptionPane.showInputDialog(null, "Qual sua idade ?", "Administrador", JOptionPane.INFORMATION_MESSAGE))));
        admin.setAltura(Double.parseDouble((JOptionPane.showInputDialog(null, "Qual sua altura ?", "Administrador", JOptionPane.INFORMATION_MESSAGE))));
        admin.setSexo(JOptionPane.showInputDialog(null, "Qual seu sexo ?", "Administrador", JOptionPane.INFORMATION_MESSAGE));
        admin.setSalario((float) Double.parseDouble(JOptionPane.showInputDialog(null, "digite seu salario", "Administrador", JOptionPane.INFORMATION_MESSAGE)));
        admin.setAjudasDeCusto(Double.parseDouble(JOptionPane.showInputDialog(null, "digite o valor da ajuda de custo", "Administrador", JOptionPane.INFORMATION_MESSAGE)));

        JOptionPane.showMessageDialog(null, "DADOS DO EMPREGADO" + "\n" + "Nome: " + admin.getNome() + "\n" + "Idade: " + admin.getIdade() + "\n" + "Sexo: " + admin.getSexo() + "\n" + "Altura: "
                                       + admin.getAltura() + "/n Ajuda de Custo :" + admin.getAjudasDeCusto());
        admin.obterLucros();
    }

}
