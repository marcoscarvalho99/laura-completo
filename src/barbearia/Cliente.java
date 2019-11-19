package barbearia;

public class Cliente extends Pessoa {
    
    public Cliente(String nomeCliente, String nomeBarbeiro, int cod, int quantPessoas, double horaMarcada) {
        super(nomeCliente, nomeBarbeiro, cod, quantPessoas, horaMarcada);
    }

    @Override
    public String toString() {
        return "Cliente" + super.getNomeCliente() + super.getNomeBarbeiro() + super.getCod() + super.getQuantPessoas() + super.getHoraMarcada();
    }

   
    
    
}
