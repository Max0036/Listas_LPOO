/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class Caminhao extends Automovel{
    
    protected String tamanho;

    public Caminhao() {
        
    }
    
    public Caminhao(String tamanho, String cor, String placa, String modelo, String marca, int kmRodado) {
        super(cor, placa, modelo, marca, kmRodado);
        this.tamanho = tamanho;
    }

   

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    

    

    
    
}