import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double valorCompra = leitor.nextDouble();
        if (valorCompra > 100) {
            double desconto = valorCompra * 0.10;
            double valorFinal = valorCompra - desconto;
            System.out.printf("Valor final com desconto: R$ %.2f%n", valorFinal);
        } else {
            System.out.printf("Valor final sem desconto: R$ %.2f%n", valorCompra);
        }

        leitor.close();
    }
}
