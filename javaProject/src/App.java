
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final String MENU = "1- Adcionar pessoal\n  2- Listar pessoal\n  3- Alterar\n 4- Excluir\n 5- Sair\n";
        boolean loop = true;

        while (loop) { 
            Scanner scanner = new Scanner(System.in);

            System.out.println(MENU);
            int escolhaUser = scanner.nextInt();

            switch(escolhaUser){
                case 1:
                    System.out.println("Adcionar pessoal");
                    break;
                case 2:
                    System.out.println("Listar pessoal");
                    break;
                case 3:
                    System.out.println("Alterar");
                    break;
                case 4:
                    System.out.println("Excluir");
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

    }
}
