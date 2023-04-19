import java.util.Scanner;
public class Aluno {
    private String Nome;
    private String Matricula;
    private double Nota1;
    private double Nota2;
    private double NotaReavaliacao;

    public Aluno(){
    }
    public Aluno(String nome, String matricula, double nota1, double nota2, double notaReavaliacao){
        Nome = nome;
        Nome = nome;
        Matricula = matricula;
        Nota1 = nota1;
        Nota2 = nota2;
        NotaReavaliacao = notaReavaliacao;
    }
    public String toString(){
        return Matricula;
    }
    public String getNome(){
        return Nome;
    }
    public void setNome(String nome){
        Nome = nome;
    }
    public String getMatricula(){
        return Matricula;
    }
    public void setMatricula(String matricula){
        Matricula = matricula;
    }
    public double getNota1(){
        return Nota1;
    }
    public void setNota1(double nota1){
        Nota1 = nota1;
    }
    public double getNota2(){
        return Nota2;
    }
    public void setNota2(double nota2){
        Nota2 = nota2;
    }
    public double getNotaReavaliacao(){
        return NotaReavaliacao;
    }
    public void setNotaReavaliacao(double notaReavaliacao){
        NotaReavaliacao = notaReavaliacao;
    }
    public double CalcularMedia(){
        double media = (getNota1() + getNota2())/2;
        return media;
    }
    public double MediaFinal(){
        if(CalcularMedia()>=6){
            System.out.println(CalcularMedia());
            return CalcularMedia();
        }else{
            System.out.println((CalcularMedia() + NotaReavaliacao)/2);
            return (CalcularMedia() + NotaReavaliacao)/2;
        }
    }
public class TesteAluno{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno("Lucas","1024",6.0,5.0,10.0);
        aluno.MediaFinal();
    }
}
}