/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao3;

import Questao2.Pessoa;

/**
 *
 * @author Max
 */
public class Fornecedor extends Pessoa{
    private double creditoMaximo;
    private double valorEmDivida;
    private double dif;
            
    public Fornecedor(String nome, int idade, double altura, String sexo) {
        super(nome, idade, altura, sexo);
    }

    public Fornecedor() {
    }
    
    public double obterSaldo (){
        dif = creditoMaximo - valorEmDivida;
        
        return dif;
    }

    
    
    public Fornecedor(double creditoMaximo, double valorEmDivida) {
        this.creditoMaximo = creditoMaximo;
        this.valorEmDivida = valorEmDivida;
    }

    
    public double getCreditoMaximo() {
        return creditoMaximo;
    }

    public void setCreditoMaximo(double creditoMaximo) {
        this.creditoMaximo = creditoMaximo;
    }

    public double getValorEmDivida() {
        return valorEmDivida;
    }

    public void setValorEmDivida(double valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }
    
    
}
