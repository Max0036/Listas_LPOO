/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class Automovel 
{
    private String cor;
    private String placa;
    private String modelo;
    private String marca;
    private int kmRodado;

    public Automovel(){
        
    }
    
    public Automovel(String cor, String placa, String modelo, String marca, int kmRodado) {
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }

    

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
}
