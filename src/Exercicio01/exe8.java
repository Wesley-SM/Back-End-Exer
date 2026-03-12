import java.util.Scanner;

public class exe8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome completo: ");
        String nomeCompleto = leitor.nextLine();

        int caracteresSemEspaco = nomeCompleto.replace(" ", "").length();
        String nomeMaiusculo = nomeCompleto.toUpperCase();
        boolean contemSilva = nomeCompleto.toLowerCase().contains("silva");

        System.out.println("Número de caracteres: " + caracteresSemEspaco);
        System.out.println("Maiúsculas: " + nomeMaiusculo);
        System.out.println("Contém \"Silva\": " + contemSilva);

        leitor.close();
    }
}
