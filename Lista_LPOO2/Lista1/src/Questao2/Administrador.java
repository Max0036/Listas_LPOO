/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao2;
import  Questao3.Fornecedor;

/**
 *
 * @author aluno
 */
public class Administrador extends Empregado {
    private double ajudasDeCusto;
    
    public Administrador() {
    }

    @Override
    public float obterlucro() {
        return super.obterlucro(); //To change body of generated methods, choose Tools | Templates.
    }

    public double getAjudasDeCusto() {
        return ajudasDeCusto;
    }

    public void setAjudasDeCusto(double ajudasDeCusto) {
        this.ajudasDeCusto = ajudasDeCusto;
    }

    public Administrador(double ajudasDeCusto) {
        this.ajudasDeCusto = ajudasDeCusto;
    }
    
}
