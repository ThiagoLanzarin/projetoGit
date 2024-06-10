import java.util.Scanner;

public class excluirPessoa {
    public void deletarPessoa(String[] pessoas, Scanner scanner) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null) {
                System.out.println(i+" - "+pessoas[i]);
            }
        }
        
        System.out.println("Qual pessoa você deseja excluir?");
        
        int escolhaUser = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null && escolhaUser == i) {
                pessoas[i] = null;
                System.out.println("Pessoa excluída com sucesso!");
                break;
            }
        }
    }
}
