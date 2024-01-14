package SistemaTransporteViario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Trecho {
    private PontoDeParada origem;
    private PontoDeParada destino;
    private int intervaloEstimado;

    public Trecho(PontoDeParada origem, PontoDeParada destino, int intervaloEstimado) {
        this.origem = origem;
        this.destino = destino;
        this.intervaloEstimado = intervaloEstimado;
    }

    public PontoDeParada getOrigem() {
        return origem;
    }

    public PontoDeParada getDestino() {
        return destino;
    }

    public int getIntervaloEstimado() {
        return intervaloEstimado;
    }

    public void salvarTrecho() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("trechos.csv", true))) {
            writer.println(origem.getNome() + "," + destino.getNome() + "," + intervaloEstimado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Trecho> carregarTrechos(List<PontoDeParada> pontosDeParada) {
        List<Trecho> trechos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("trechos.csv"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 3) {
                    PontoDeParada origem = encontrarPontoDeParada(pontosDeParada, partes[0]);
                    PontoDeParada destino = encontrarPontoDeParada(pontosDeParada, partes[1]);
                    int intervaloEstimado = Integer.parseInt(partes[2]);

                    Trecho trecho = new Trecho(origem, destino, intervaloEstimado);
                    trechos.add(trecho);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return trechos;
    }

    private static PontoDeParada encontrarPontoDeParada(List<PontoDeParada> pontosDeParada, String nome) {
        for (PontoDeParada ponto : pontosDeParada) {
            if (ponto.getNome().equals(nome)) {
                return ponto;
            }
        }
        return null;
    }
}
