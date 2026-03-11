import java.util.Random;
import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();
        String[] titulos = {
                "Miranha",
                "Doido de Pedra",
                "Cavaleiro Sem Cavalo",
                "O ultimo Programador",
                "Indo pra voltar",
                "Silêncio Do Barulho",
                "Harry poter"
        };

        String[] generos = {
                "Drama Psicológico",
                "Suspense Noir",
                "Documentário",
                "Terror Experimental",
                "Ficção Distópica"
        };

        // Entrada do usuário
        System.out.print("Quantos filmes você deseja gerar? ");
        int quantidade = leitor.nextInt();

        System.out.println("\n--- Sugestões de Filmes Alternativos ---");

        for (int i = 0; i < quantidade; i++) {
            // Sorteia título e gênero
            String titulo = titulos[random.nextInt(titulos.length)];
            String genero = generos[random.nextInt(generos.length)];

            // 2. Gera duração entre 80 e 180 minutos
            int duracao = random.nextInt(101) + 80;

            // 3. Saída formatada
            System.out.println("\"" + titulo + "\" é um filme de " + genero + " com duração de " + duracao + " minutos.");
        }

        leitor.close();
    }
}
