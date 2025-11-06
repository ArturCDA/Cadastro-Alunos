package Aluno;

public class Turma {
    private Aluno[] alunos;
    private int quantidade;

    public Turma (){
        alunos = new Aluno [5];
        this.quantidade = 0;
    }

    public void adicionarAluno (Aluno aluno){
        if (quantidade < 5){
           alunos[quantidade] = aluno;
           quantidade++;
        } else {
            return;
        }
    }

    public void listarAlunos(){
        for (int i = 0; i < alunos.length; i++){
            if(alunos[i] != null)
            alunos[i].exibirInfo();
        }
    }

    public Aluno buscarMatricula(String matricula){
        for (int i = 0; i < quantidade; i++){
            if(alunos[i].getmatricula() == matricula){
                return alunos[i];
            }
        }

        return null;
    }

}
