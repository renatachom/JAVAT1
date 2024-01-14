package pratica.orientada;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiarArquivo {

    public static void main(String[] args) {
        String arquivoOrigem = "origem.txt";
        String arquivoDestino = "destino.txt";

        try {
            // Cria um objeto FileReader para ler o arquivo de origem
            FileReader fileReaderOrigem = new FileReader(arquivoOrigem);
            BufferedReader bufferedReaderOrigem = new BufferedReader(fileReaderOrigem);

            // Cria um objeto FileWriter para escrever no arquivo de destino
            FileWriter fileWriterDestino = new FileWriter(arquivoDestino);
            BufferedWriter bufferedWriterDestino = new BufferedWriter(fileWriterDestino);

            String linha;

            // Lê cada linha do arquivo de origem e escreve no arquivo de destino
            while ((linha = bufferedReaderOrigem.readLine()) != null) {
                bufferedWriterDestino.write(linha);
                bufferedWriterDestino.newLine();
            }

            // Fecha os recursos após a cópia
            bufferedReaderOrigem.close();
            fileReaderOrigem.close();
            bufferedWriterDestino.close();
            fileWriterDestino.close();

            System.out.println("Cópia do arquivo concluída. Conteúdo copiado de '" + arquivoOrigem + "' para '" + arquivoDestino + "'.");
        } catch (IOException e) {
            // Trata exceções durante a cópia do arquivo
            e.printStackTrace();
        }
    }
}
