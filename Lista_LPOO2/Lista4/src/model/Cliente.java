/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class Cliente extends Pessoa{
    protected String endereco;

    
    public String getEndereço() {
        return endereco;
    }

    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }

    public Cliente(String endereço) {
        this.endereco = endereço;
    }

   

    public Cliente() {
    }

    
    
}
