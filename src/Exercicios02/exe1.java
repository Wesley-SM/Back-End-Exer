
import java.util.Random;

public class exe1 {
    public static void main(String[] args) {

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder senha = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int indiceAleatorio = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indiceAleatorio));
        }
        System.out.println("Senha gerada: " + senha.toString());
    }
}
