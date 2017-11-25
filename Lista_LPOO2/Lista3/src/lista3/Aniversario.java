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
public class Aniversario extends CartaoWeb {

    public Aniversario() {
    }
    public void Aniverario(String destinario){
        
    }

    @Override
    public void retornarMensagem(String remetente, String destinatario) {
        String msgAniver = String.format("Querido(a) %s ,\n Feliz Aniversário! \n Te desejo muitas felicidades"
                + " para hoje e muita saúde, amor e sucesso para todos os dias da sua vida. \n Atenciosamente %s", destinatario, remetente);
        JOptionPane.showMessageDialog(null, msgAniver);
    }
    
}
