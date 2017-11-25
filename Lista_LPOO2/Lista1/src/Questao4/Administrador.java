/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao4;

import javax.swing.JOptionPane;
import Questao2.Empregado;

/**
 *
 * @author adilson
 */
public class Administrador extends Empregado {
    
    private double ajudasDeCusto;

    public Administrador() {
    }

    public Administrador(double ajudasDeCusto) {
        this.ajudasDeCusto = ajudasDeCusto;
    }
    
    public double getAjudasDeCusto() {
        return ajudasDeCusto;
    }

    public void setAjudasDeCusto(double ajudasDeCusto) {
        this.ajudasDeCusto = ajudasDeCusto;
    }

    public void obterLucros() {
        setSalario((float) (getSalario()+getAjudasDeCusto()));
        JOptionPane.showMessageDialog(null,"Lucros do Administrador: "+getSalario());
    }
    
    
    
    
    
            
    
}
