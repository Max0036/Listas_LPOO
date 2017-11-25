/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

/**
 *
 * @author Max
 */
public abstract class  CartaoWeb {
    String  destinatario;
    
    public CartaoWeb(){
        
    }
            
    /**
     *
     * @param remetente
     * @param destinatario
     */
    public abstract void retornarMensagem(String remetente , String destinatario);

    
    
}
