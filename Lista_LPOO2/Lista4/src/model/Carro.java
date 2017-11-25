/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */

public class Carro extends Automovel{
    
    protected String combustivel;
    protected String capacidade;
    
    public Carro() {
    }
    
    public Carro(String combustivel, String capacidade, String cor, String placa, String modelo, String marca, int kmRodado) {
        super(cor, placa, modelo, marca, kmRodado);
        this.combustivel = combustivel;
        this.capacidade = capacidade;
    }

    

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }
      
}

