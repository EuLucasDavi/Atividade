public class Banco {
    static class ContaCorrente{
        private String Nome;
        private String Sexo;
        private int Idade;
        private int NumConta;
        private String Conj;
        private double Saldo;

        public ContaCorrente(){
        }
        public ContaCorrente(String nome,String sexo,int idade,int numConta, String conj, double saldo){
            Nome = nome;
            Sexo = sexo;
            Idade = idade;
            NumConta = numConta;
            Conj = conj;
            Saldo = saldo;
        }
        //Getters e Setters
        public String getNome(){
            return Nome;
        }
        public void setNome(String nome){
            nome = Nome;
        }
        public String getSexo(){
            return Sexo;
        }
        public void setSexo(String sexo){
            sexo = Sexo;
        }
        public int getIdade(){
            return Idade;
        }
        public void setSexo(int idade){
            idade = Idade;
        }
        public int getNumConta(){
            return NumConta;
        }
        public void setNumConta(int numConta){
            numConta = NumConta;
        }
        public String getConj(){
            return Conj;
        }
        public void setConj(String conj){
            conj = Conj;
        }
        public double getSaldo(){
            return Saldo;
        }
        public void setSaldo(double saldo){
            saldo = Saldo;
        }

        //Métodos Solicitados
        public double Saque(double valor){
            if (Saldo>0){
                Saldo = Saldo - valor;
            }else{
                System.out.println("Saldo Insuficiente");
            }
            return Saldo;
        }
        public void Saldo(){
            System.out.println("Nome do Correntista: "+ Nome+"\nNúmero da conta: "+NumConta+"\nConta Conjunta? "+Conj+"Saldo: "+Saldo);
        }
        public double Deposito(double dep){
            Saldo = Saldo + dep;
            return Saldo;
        }
    }
    public static void main(String[] args){
        ContaCorrente a = new ContaCorrente("Fernando","Masculino",29,1234,"Nao",1500.00);
        ContaCorrente b = new ContaCorrente("Maria","Feminino",45,5312,"Sim",530.31);
        ContaCorrente c = new ContaCorrente("Joao","Masculino",54,9621,"Sim",4325.12);
    }
}
