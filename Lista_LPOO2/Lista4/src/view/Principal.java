package view;

import controller.GerarAluguel;
import java.util.*;
import model.*;

public class Principal {
    public static void main(String[] args){
        
            Scanner sc = new Scanner(System.in);
            
            ArrayList <AluguelAutomovel> alugueis = new ArrayList<>();
            ArrayList <Pessoa> pessoas = new ArrayList<>();
            ArrayList <Automovel> automoveis = new ArrayList<>();
            int resp;
            
            do{
               System.out.println("Escolha uma opção:\n1 - Cadastrar Pessoa:\n2 - Cadastrar Automóvel:\n3 - Criar Aluguel:\n4 - Sair");
                resp = sc.nextInt();
            switch (resp){
                case 1: 
                    
                   System.out.println("Deseja cadastrar: \n 1 - Funcionario\n 2 - Cliente");
                    int opcao = sc.nextInt();
                    if(opcao == 1){
                         Funcionario f = new Funcionario();
                         System.out.println("Nome: ");
                         f.setNome(sc.next());
                         System.out.println("CPF: ");
                         f.setCpf(sc.next());
                         System.out.println("Matricula: ");
                         f.setMatricula(sc.nextDouble());
                         System.out.println("Idade:");
                         f.setIdade(sc.nextInt());
                         pessoas.add(f);
                         break;
                    }else if(opcao == 2){
                         Cliente c = new Cliente();
                         System.out.println("Nome: ");
                         c.setNome(sc.next());
                         System.out.println("CPF: ");
                         c.setCpf(sc.next());
                         System.out.println("Endereço:");
                         c.setEndereço(sc.next());
                         System.out.println("Idade:");
                         c.setIdade(sc.nextInt());
                         
                         pessoas.add(c);
                         break;
                    }
                break;
                case 2 : 
                   
                   System.out.println("Deseja cadastrar: \n 1 - Carro\n 2 - Caminhão");
                    int opc = sc.nextInt();
                    if(opc == 1){
                         Carro car = new Carro();
                         System.out.println("Modelo: ");
                         car.setModelo(sc.next());
                         System.out.println("Marca: ");
                         car.setMarca(sc.next());
                         System.out.println("Cor:");
                         car.setCor(sc.next());
                         System.out.println("Placa: ");
                         car.setPlaca(sc.next());
                         System.out.println("capacidade: ");
                         car.setCapacidade(sc.next());
                         System.out.println("Combustivel: ");
                         car.setCombustivel(sc.next());
                         automoveis.add(car);
                         break;
                    }else if(opc == 2){
                         Caminhao cam = new Caminhao();
                         System.out.println("Modelo: ");
                         cam.setModelo(sc.next());
                         System.out.println("Marca: ");
                         cam.setMarca(sc.next());
                         System.out.println("Cor:");
                         cam.setCor(sc.next());
                         System.out.println("Placa:");
                         cam.setPlaca(sc.next());
                         System.out.println("Tamanho: ");
                         cam.setTamanho(sc.next());
                         automoveis.add(cam);
                         break;
            }
                
                case 3 : 
                    
                    System.out.println("Qual a posição da pessoa?");
                    int posiP = sc.nextInt();
                    System.out.println("Qual a posição do Carro ?");
                    int posiC = sc.nextInt();
                    System.out.println("Qual o tipo de Aluguel:\n 1: Diaria\n2: Mensal");
                    int esc = sc.nextInt();
                    
                    if(esc == 1){
                        GerarAluguel ga1 = new GerarAluguel();
                        alugueis.add(ga1.calcularAluguel((Cliente) pessoas.get(posiP), (Carro) automoveis.get(posiC), "Diaria")); 
                        System.out.println("Aluguel Diario Gerado");
                         break;
                    }
                    else if(esc == 2){
                        GerarAluguel ga1 = new GerarAluguel();
                       alugueis.add( ga1.calcularAluguel((Cliente) pessoas.get(posiP), (Carro) automoveis.get(posiC), "Mensal"));
                        System.out.println("Aluguel Mensal Gerado");
                         break;
                    }
                   
        
            }
               
            }while(resp != 4);
    }
}
    
    
            
    

