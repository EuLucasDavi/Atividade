import java.util.Scanner;
public class Funcionario {
    static class Dados{
        public String Nome;
        public double SalarioBruto;
        public double Desconto;

        public Dados(){
        }
        public Dados(String nome,double salariobruto,double desconto){
            Nome = nome;
            SalarioBruto = salariobruto;
            Desconto = desconto;
        }
        public String getNome() {
            return Nome;
        }
        public void setNome(String nome) {
            Nome = nome;
        }
        public double getSalarioBruto() {
            return SalarioBruto;
        }
        public void setSalarioBruto(double salariobruto) {
            SalarioBruto = salariobruto; 
        }
        public double getDesconto() {
            return Desconto;
        }
        public void setDesconto(double desconto) {
            SalarioBruto = desconto; 
        }

        public double salarioliquido(){
            double sl = SalarioBruto - Desconto;
            return sl;
        }
        public double aumenta(int porcentagem,double SalarioBruto){
            double a = (porcentagem/100) * SalarioBruto + SalarioBruto;
            return a;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String n = sc.nextLine();
        System.out.print("Salario Bruto: ");
        double sb = sc.nextDouble();
        System.out.print("Desconto: ");
        double d = sc.nextDouble();
        Dados dados = new Dados(n,sb,d);
        String nm = dados.getNome();
        System.out.println("Dados do Funcionário: "+ nm + ", R$" + sb);
        double desc = dados.salarioliquido();
        System.out.println("Salario líquido: R$"+ desc);
        System.out.print("Deseja aumentar o salário em qual porcentagem? ");
        int por = sc.nextInt();
        double novoSal = dados.aumenta(por,sb);
        System.out.print("Dados do Funcionário: "+ n +", R$ "+ novoSal);
    }
}