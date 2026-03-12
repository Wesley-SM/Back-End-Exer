import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);


        System.out.print("Peso: ");
        double peso = leitor.nextDouble();
        System.out.print("Sua Altura com virgula: ");
        double altura = leitor.nextDouble();
        double imc = calcularIMC(peso, altura);
        System.out.printf("IMC calculado: %.2f%n", imc);
        leitor.close();
    }
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}
