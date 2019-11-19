
package barbearia;

import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
    private ArrayList <Pessoa> pessoas = new ArrayList <>(); 
    private String nomeCliente, nomeBarbeiro; // nome co carinha que vai cortar
    private int cod=1, quantPessoas; //pessoas na frente do cliente.
    private double horaMarcada; // hora que ele recebe depois do calculo de quantos clientes esta na frente dele lembrando que sempre ele começa as 9 da manha a cortar.
    Scanner entrada = new Scanner (System.in);
    
    
    
    public Pessoa(String nomeCliente, String nomeBarbeiro, int cod, int quantPessoas, double horaMarcada) {
        this.nomeCliente = nomeCliente;
        this.nomeBarbeiro = nomeBarbeiro;
        this.cod = cod;
        this.quantPessoas = quantPessoas;
        this.horaMarcada = horaMarcada;
    }
    
     public Pessoa(){}

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeBarbeiro() {
        return nomeBarbeiro;
    }

    public void setNomeBarbeiro(String nomeBarbeiro) {
        this.nomeBarbeiro = nomeBarbeiro;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getQuantPessoas() {
        return quantPessoas;
    }

    public void setQuantPessoas(int quantPessoas) {
        this.quantPessoas = quantPessoas;
    }

    public double getHoraMarcada() {
        return horaMarcada;
    }

    public void setHoraMarcada(double horaMarcada) {
        this.horaMarcada = horaMarcada;
    }

    @Override
    public String toString() {
        return "Pessoa:" + "nomeCliente=" + nomeCliente + ", nomeBarbeiro=" + nomeBarbeiro + ", cod=" + cod + ", quantPessoas=" + quantPessoas + ", horaMarcada=" + horaMarcada;
    }
    
    public void menu(){
        int num;
        do{
        System.out.println("--------BARBEARIA IMPERIO--------");
        System.out.println("\n\n\n   1 - Marcar corte");
        System.out.println("         2 - ver cortes marcados");
        System.out.println("         3 - Sair");
        
        
         num= entrada.nextInt();
        
        switch(num){
            case 1:
              cadastrar();  
                
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Digite uma opção valida....");
        }
        }while(num!=3);
        
        
    }
    public void cadastrar(){
        boolean cont=false;
        do{
     System.out.println("TELA DE CADASTRO");
                System.out.println(" 1 - Cliente 2 - Funcionario");
                int num2=entrada.nextInt();
                if(num2==1){
                    System.out.println("digite o nome do cliente:");
                        String nome1;
                        pessoas.add(new Cliente(nome1=entrada.next(),"Kassio Dantas",this.cod++, this.quantPessoas++,12.30));
                        System.out.println("cliente cadastrado na lista de corte");
                        cont=true;
                        break;
                }
                else if(num2==2){
                    System.out.println("digite o nome do funcionario:");
                       String nomeF= entrada.next();
                        pessoas.add(new Funcionario(nomeF,"Kassio Dantas",2, 3,12.3));
                        System.out.println("funcionario cadastrado na lista de corte");
                        cont=true;
                        break;
                        
                        
                    
                } else System.out.println("Tipo de pessoa não identificada, por favor tente de novo....");
        }while(cont==false);     
        }
        
    
    }    
    
    
    
    
    
    
    
