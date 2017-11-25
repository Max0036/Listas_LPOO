/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */

public class  Funcionario extends Pessoa {
    protected double matricula;

    public Funcionario(double matricula, String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.matricula = matricula;
    }

    public Funcionario(double matricula, String nome, String cpf) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public Funcionario(double matricula) {
        this.matricula = matricula;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public Funcionario() {
        super();
    }
 
}

