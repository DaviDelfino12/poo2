package ads.poo;

public class Estudante {

    private String nome;
    private String matricula;
    private String curso;
    private static int total = 0;
    
    public Estudante(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        total++;
    }
 
    public String getNome() {
        return nome;
    }
  
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getMatricula() {
        return matricula;
    }
 
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
  
    public String getCurso() {
        return curso;
    }
 
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public static int getTotal() {
        return total;
    }


    @Override
    public String toString() {
        return "Nome = " + nome + 
        "\nMatricula = " + matricula + 
        "\nCurso = " + curso;
    }



}
