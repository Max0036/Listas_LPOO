/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

import javax.swing.JOptionPane;

/**
 *
 * @author Max
 */
public class Natal extends CartaoWeb{
        public Natal (){
    
}
    public Natal(String destinatario) {
    }

    @Override
    public void retornarMensagem(String remetente, String destinatario) {
        String msgNatal = String.format("Querido(a) %s ,\n Feliz natal! \n Desejo que o seu Natal "
                + "seja brilhante de alegria, iluminado de amor, paz e harmonia. , \n Atenciosamente %s.", destinatario, remetente);
        
        JOptionPane.showMessageDialog(null, msgNatal);
    }
    }

