/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Max
 */
public class Lista3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CartaoWeb [] cartoes = new CartaoWeb[3];
        cartoes[0] = new DiaDosNamorados();
        cartoes[1] = new Natal();
        cartoes[2] = new Aniversario();
        
        CartaoWeb cartaoselecionado;
        
        for(int i = 0; i<3; i++){
            
            cartaoselecionado = cartoes[i];
            cartaoselecionado.retornarMensagem(JOptionPane.showInputDialog("Insira Remetente: "), JOptionPane.showInputDialog("Insira Destinatario: "));
        }
    }
    
}
