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
public class Cocker extends Cachorro {

    public Cocker(String nome, String raca){
        super(nome,raca);
    
    }
    
    private boolean tosa;
    
    public Cocker (){
        
    }
    public void setTosa (boolean tosa){
        this.tosa = tosa;
    }
    public  void precisaTosa() {
        if (tosa = true) {
            System.out.println("Precisa de Tosa");
            
        }else {
            System.out.println("Não precisa de tosa");
        }
    }
}
