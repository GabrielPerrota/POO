public class Alunos {
    int matricula;
    String nome;

     Alunos (String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;   
    }

    void cadastrar(String novoaluno, int novamatricula){
        this.matricula = novamatricula;
        this.nome = novoaluno;

    }
    
}
