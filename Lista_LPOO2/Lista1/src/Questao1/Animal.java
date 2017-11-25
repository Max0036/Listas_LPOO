/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao1;

/**
 *
 * @author Max
 */
public class Animal {
    private String Cor;
    private String Tipo;
    
    public Animal(){
        
    }
    public Animal(String Cor , String Tipo){
        this.Cor = Cor;
        this.Tipo = Tipo;
               
    }

    public String getCor(){
        return Cor;
    }
    public void setCor (String Cor){
        this.Cor = Cor;
        
    }
    
    public String getTipo(){
        return Tipo;
    }

    public void setTipo(String Tipo){
        this.Tipo = Tipo ;
    }
    @Override
    public String toString() {
        return "Animal{" + "Cor=" + Cor + ", Tipo=" + Tipo + '}';
    }
}
