
import java.util.Scanner;

public class adicionarPessoa {
    public void adicionandoPessoa(String[] pessoas, Scanner scanner) {
        System.out.println("Digite um nome de uma pessoa");
        String nome = scanner.nextLine();

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] == null) {
                pessoas[i] = nome;
                System.out.println("Pessoa adicionada com sucesso");
                break;
            }
        }
    }
}
