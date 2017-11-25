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
public class DiaDosNamorados extends CartaoWeb{

    public DiaDosNamorados() {
    }
    public void DiaDosNamorados() {
    }

    @Override
    public void retornarMensagem(String remetente, String destinatario) {
        String msgNamorado = String.format("Querida %s ,\n Feliz dia dos namorados! \n Espero que esse "
                + " tenha sido o único cartão do dia dos namorados que tenha ganhado nessa data! De coração, \n %s", destinatario, remetente);
        JOptionPane.showInputDialog(null, msgNamorado);
    }

}
