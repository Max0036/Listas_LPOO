/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao2;

/**
 *
 * @author Max
 */
public class Empregado extends Pessoa {
    private float salario;
   
    public Empregado(){
        
    }
    public float obterlucro(){
        return salario;
    }
    public float getSalario() {
        return salario;
    }

    public Empregado(float salario) {
        this.salario = salario;
    }

    public Empregado(float salario, String nome, int idade, double altura, String sexo) {
        super(nome, idade, altura, sexo);
        this.salario = salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    

}
