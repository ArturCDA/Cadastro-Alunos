package Aluno;

public class principalAluno {
    public static void main(String[] args) {
       Turma t = new Turma();
       Aluno ana = new Aluno("Ana", "101", 7.5, 7.5);
       Aluno joao = new Aluno("João", "102", 6.0, 6.0);
       Aluno maria = new Aluno("Maria", "103", 9.0, 9.0);

       t.adicionarAluno(ana);
       t.adicionarAluno(joao);
       t.adicionarAluno(maria);

       t.listarAlunos();

       Aluno a = t.buscarMatricula("102");
       if( a != null){
       a.exibirInfo();
       }

    }
}
