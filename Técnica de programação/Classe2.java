import java.util.Scanner;
public class Classe2{
    static class Calcular{
        public double Largura;
        public double Altura;

        public Calcular(){
        }
        public Calcular(double largura,double altura){
            Largura = largura;
            Altura = altura;
        }
        public double getAltura() {
            return Altura;
        }
        public void setAltura(double altura) {
            Altura = altura;
        }
        public double getLargura() {
            return Largura;
        }
        
        public void setLargura(double largura) {
            Largura = largura;
        }
        public double Area(){
            double area;
            area = Largura * Altura;
            return area;
        }
        public double Perimetro(){
            double perimetro;
            perimetro = Largura *2 + Altura*2;
            return perimetro;
        }
        public double Diagonal(){
            double diagonal;
            diagonal = Math.sqrt(Math.pow(Largura,2)+Math.pow(Altura,2));
            return diagonal;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a Largura do retângulo:");
        double largura = sc.nextDouble();
        System.out.println("Digite a Altura do retângulo:");
        double altura = sc.nextDouble();
        Calcular c1 = new Calcular(largura,altura);
        double a = c1.Area();
        System.out.println("Área: " + a);
        double p = c1.Perimetro();
        System.out.println("Perímetro: " + p);
        double d = c1.Diagonal();
        System.out.println("Diagonal: " + d);
    }
}