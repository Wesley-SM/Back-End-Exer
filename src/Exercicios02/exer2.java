import java.util.Random;

public class exer2 {
    public static void main(String[] args) {
        Random random = new Random();


        String[] nomes = {"Cleiton", "Wellington", "Adailton", "Fabrício", "Janderson"};
        String[] sobrenomes = {"dos Santos", "Oliveira", "Pereira", "da Silva", "Cavalcante"};
        String[] posicoes = {"volante", "zagueiro central", "lateral-esquerdo", "ponta-de-lança", "guarda-redes"};


        String[] times = {"gramio", "Poca Bola", "inter", "criciuma", "Perna Torta"};


        String nome = nomes[random.nextInt(nomes.length)];
        String sobrenome = sobrenomes[random.nextInt(sobrenomes.length)];
        String posicao = posicoes[random.nextInt(posicoes.length)];
        String time = times[random.nextInt(times.length)];


        int idade = random.nextInt(18) + 18;


        System.out.println(nome + " " + sobrenome + " é um futebolista de " + idade +
                " anos que atua como " + posicao + ". Atualmente joga no " + time + ".");
    }
}
