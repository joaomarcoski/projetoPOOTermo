package projetoPOOTermo;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("sagaz", "amago");

        JogoAdivinhacao jogo = new JogoAdivinhacao(palavras);
        jogo.iniciarJogo();
    }
}
/*
, "negro", "termo", "exito", "mexer", "nobre", "senso", "afeto", "algoz",
            "etica", "plena", "mutua", "tenue", "fazer", "assim", "vigor", "sutil", "aquem", "porem",
            "secao", "fosse", "sanar", "poder", "audaz", "ideia", "cerne", "inato", "moral", "sobre",
            "desde", "muito", "justo", "honra", "quica", "torpe", "sonho", "razao", "futil", "etnia",
            "icone", "anexo", "amigo", "egide", "tange", "lapso", "haver", "expor", "dengo", "mutuo", "tempo"
 */
