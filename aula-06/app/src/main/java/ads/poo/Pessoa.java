package ads.poo;

public class Pessoa {
    
    private String nome;
    private String cpf;
    public String getNome() {
        return nome;
    }
    
    
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(){
        
    }
   
    public String imprimePessoa() {
        return "(Nome: " + nome + ", CPF: " + cpf + ")";
    }

    

}
