public class listarPessoa{
    public void listarPessoas(String[] pessoas) {
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] != null) {
                System.out.println(pessoas[i]);
            }
        }
    }
}
