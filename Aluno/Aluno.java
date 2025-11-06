package Aluno;

public class Aluno {
    private String nome;
    private String matricula;
    private double n1,n2;

    public Aluno (String nome, String matricula, double n1, double n2){
        this.nome = nome;
        this.matricula = matricula;
        this.n1 = n1;
        this.n2 = n2;

    }

    public String getmatricula (){
        return matricula;
    }


    public double calcularMedia(){
        double media = (n1 + n2) / 2.0;
        return media;
    }

    public String situacao(){
        if (this.calcularMedia() >= 7.0){
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public void exibirInfo(){
        System.out.println("Aluno:\n" +
                "Nome: " + nome + "\n" +
                "Matrícula: " + matricula + "\n" +
                "Notas: " + n1 + ", " + n2 + "\n" +
                "Média: " + this.calcularMedia() + "\n" +
                "Situação: " + this.situacao());
    }
}