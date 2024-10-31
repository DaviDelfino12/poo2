package ads.poo;

public class Pessoa {
    
    private String nome;
    private String cpf;
    private String sobrenome;
    
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
   

    public Pessoa(String n, String sobrenome) {
        this(n);
        this.sobrenome = sobrenome;
    }
   
    
    public Pessoa(String nome, String cpf, String sobrenome) {
        this(nome, sobrenome);
        this.cpf = cpf;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }




    public String imprimePessoa() {
        return "(Nome: " + nome + ", CPF: " + cpf + ")";
    }

    

}
