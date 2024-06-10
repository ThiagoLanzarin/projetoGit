
import java.util.Scanner;

public class alterarPessoas {
    public void alterarPessoa(String[] pessoas, Scanner scanner) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null) {
                System.out.println(i+" - "+pessoas[i]);
            }
        }
        
        System.out.println("Qual pessoa você deseja alterar?");
        
        int escolhaUser = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null && escolhaUser == i) {
                System.out.println("Digite o novo nome: ");
                pessoas[i] = scanner.nextLine();
                System.out.println("Nome alterado com sucesso!");
                break;
            }
        }
    }
}  
