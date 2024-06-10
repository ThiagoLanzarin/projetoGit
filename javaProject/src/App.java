
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final String MENU = "1- Adcionar pessoal\n  2- Listar pessoal\n  3- Alterar\n 4- Excluir\n 5- Sair\n";

        while (true) { 
            Scanner scanner = new Scanner(System.in);

            System.out.println(MENU);
            scanner.nextInt();
        }

    }
}
