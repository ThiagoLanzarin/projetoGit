
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final String MENU = "\n 1- Adcionar pessoal\n 2- Listar pessoas\n 3- Alterar\n 4- Excluir\n 5- Sair\n";
        boolean loop = true;
        String[] pessoas = new String[5];

        while (loop) { 
            Scanner scanner = new Scanner(System.in);

            System.out.println(MENU);
            int escolhaUser = scanner.nextInt();
            scanner.nextLine();
            
            switch(escolhaUser){
                case 1 -> {
                    adicionarPessoa adicionarPessoa = new adicionarPessoa();
                    adicionarPessoa.adicionandoPessoa(pessoas, scanner);
                }
                case 2 -> {
                    listarPessoa listarPessoas = new listarPessoa();
                    listarPessoas.listarPessoas(pessoas);
                }
                case 3 -> {
                    alterarPessoas alterarPessoas = new alterarPessoas();
                    alterarPessoas.alterarPessoa(pessoas, scanner);
                }
                case 4 -> System.out.println("Excluir");
                case 5 -> loop = false;
                default -> System.out.println("Opção inválida");
            }
        }

    }
}
