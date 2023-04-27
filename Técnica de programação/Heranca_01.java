public class Heranca_01 {
    public class Funcionario {
        private String nome;
        private String cpf;
        private double salario;

        // Getters e Setters
        public String getNome() {
            return nome;
        }

        public void setNome(String Nome) {
            nome = Nome;
        }

        public String getCPF() {
            return cpf;
        }

        public void setCPF(String CPF) {
            cpf = CPF;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double Salario) {
            salario = Salario;
        }
    }

    public class Gerente extends Funcionario{
        private int senha;
        private boolean a;
        public boolean autentica (int Senha){
            if (Senha == senha){
                a = true;
                System.out.println("Acesso concedido!");
            }else{
                a = false;
                System.out.println("Acesso negado!");
            }
            return a;
        }
    }
}