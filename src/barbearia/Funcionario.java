/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barbearia;

/**
 *
 * @author lenovo
 */
public class Funcionario extends Pessoa{
    
    public Funcionario(String nomeCliente, String nomeBarbeiro, int cod, int quantPessoas, double horaMarcada) {
        super(nomeCliente, nomeBarbeiro, cod, quantPessoas, horaMarcada);
    }
    
    
    @Override
    public String toString() {
        return "Funcionrio" + super.getNomeCliente() +"cortara cabelo com"+ super.getNomeBarbeiro() +"seu codigo é"+ super.getCod() + super.getQuantPessoas() + super.getHoraMarcada();
    }
}
