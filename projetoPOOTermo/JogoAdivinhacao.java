package projetoPOOTermo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JogoAdivinhacao {

    private PalavraSecreta palavraSecreta;
    private StringBuilder palavraAdivinhada;
    private int tentativasRestantes;
    List<String> letrasCorretas = new ArrayList<>(Arrays.asList(" _ ", "_ ", "_ ", "_ ", "_ "));
    ArrayList<String> letraPosicaoErrada = new ArrayList<>();


    public JogoAdivinhacao(List<String> palavras) {
        this.palavraSecreta = new PalavraSecreta(palavras);
        this.palavraAdivinhada = new StringBuilder();
        this.tentativasRestantes = 5; // Número de tentativas permitidas
    }

    public void iniciarJogo() {
        Scanner scanner = new Scanner(System.in);

        while (tentativasRestantes > 0 && !palavraAdivinhada.toString().equals(palavraSecreta.getPalavra())) {
            exibirStatusJogo();
            System.out.print("Digite uma palavra: ");
            String palpite = scanner.next().toUpperCase();
            
             if (palpite.length() == palavraSecreta.getTamanho() && palpite.equals(palavraSecreta.getPalavra())) {
                palavraAdivinhada = new StringBuilder(palavraSecreta.getPalavra());
            } else if (palpite.length() == palavraSecreta.getTamanho() && !palpite.equals(palavraSecreta.getPalavra())) {
                //verificarPalpite(palpite);
            }
        }
        scanner.close();

        if (palavraAdivinhada.toString().equals(palavraSecreta.getPalavra())) {
            System.out.println("Parabéns! Você adivinhou a palavra correta: " + palavraSecreta.getPalavra());
        } else {
            System.out.println("Você perdeu! A palavra correta era: " + palavraSecreta.getPalavra());
        }
    }

    private void exibirStatusJogo() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Palavra a ser adivinhada: " + letrasCorretas);
        System.out.println("Tentativas restantes: " + tentativasRestantes);
    }

    //Verificar o palpite
    /*
        private void verificarPalpite(String palpite) {
        boolean letraEncontrada = false;
        for (int i = 0; i < 6; i++) {
            char letra = palpite.charAt(i);
            if (palavraSecreta.getLetra(j) == letra){
                letrasCorretas.set(i, letra);
                letraEncontrada = true;
            }
        }

        if (!letraEncontrada) {
            System.out.println("Letra incorreta! Tente novamente.");
        }

        tentativasRestantes--;
    }
     */

}
