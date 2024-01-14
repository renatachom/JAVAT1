package SistemaTransporteViario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Trajeto {
    private List<Trecho> trechos;

    public Trajeto(List<Trecho> trechos) {
        this.trechos = trechos;
    }

    public List<Trecho> getTrechos() {
        return trechos;
    }

    public void salvarTrajeto() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("trajetos.csv", true))) {
            for (Trecho trecho : trechos) {
                writer.println(trecho.getOrigem().getNome() + "," + trecho.getDestino().getNome() + "," + trecho.getIntervaloEstimado());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Trajeto> carregarTrajetos(List<PontoDeParada> pontosDeParada) {
        List<Trajeto> trajetos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("trajetos.csv"))) {
            String linha;
            List<Trecho> trechosDoTrajeto = new ArrayList<>();
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 3) {
                    PontoDeParada origem = encontrarPontoDeParada(pontosDeParada, partes[0]);
                    PontoDeParada destino = encontrarPontoDeParada(pontosDeParada, partes[1]);
                    int intervaloEstimado = Integer.parseInt(partes[2]);

                    Trecho trecho = new Trecho(origem, destino, intervaloEstimado);
                    trechosDoTrajeto.add(trecho);
                }
            }
            if (!trechosDoTrajeto.isEmpty()) {
                trajetos.add(new Trajeto(trechosDoTrajeto));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return trajetos;
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
