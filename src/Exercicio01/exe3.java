package Exercicio01;

public class exe3 {
    public static void main(String[] args) {

        String nome = "Mouse Gamer";
        int codigo = 9876;
        double preco = 159.90;
        boolean emPromocao = false;
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Em promoção: " + (emPromocao ? "Sim" : "Não"));
    }
}
