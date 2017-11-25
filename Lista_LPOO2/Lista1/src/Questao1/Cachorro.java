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
public class Cachorro extends Animal {
    public Cachorro(String Cor,String Tipo){
        super(Cor,Tipo);
    }
    private String nome ;
    private String raca;
    
    
public Cachorro (){
    
}
    public Cachorro(String nome, String raca, String Cor, String Tipo) {
        super(Cor, Tipo);
        this.nome = nome;
        this.raca = raca;
    }

    
    public String getNome (){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getRaca (){
        return raca;
    }
    public void setRaca (String raca){
        this.raca = raca;
    }
    @Override
    public String toString (){
        return "Cachorro{"+"nome="+ nome +",raca="+ raca +'}';
    }
}
    

