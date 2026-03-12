public class exe6 {
    public static void main(String[] args) {

        double[] notas = {6, 7, 7, 6, 8};
        double soma = 0;
        System.out.print("Notas: ");
        for (double nota : notas) {
            System.out.print((int)nota + " ");
            soma += nota;
        }
        double media = soma / notas.length;
        System.out.println("\nMédia: " + media);
    }
}
