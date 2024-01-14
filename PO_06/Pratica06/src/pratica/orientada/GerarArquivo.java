package pratica.orientada;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GerarArquivo {

    public static void main(String[] args) {
        String nomeArquivo = "origem.txt";

        try {
            // Cria um objeto FileWriter para escrever no arquivo
            FileWriter fileWriter = new FileWriter(nomeArquivo);

            // Cria um objeto BufferedWriter para escrever linhas no arquivo
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Escreve algumas linhas no arquivo
            bufferedWriter.write("Este é um exemplo de arquivo gerado por um programa em Java.");
            bufferedWriter.newLine();
            bufferedWriter.write("Você pode adicionar mais linhas conforme necessário.");
            bufferedWriter.newLine();
            bufferedWriter.write("Fechando o arquivo.");

            // Fecha os recursos após a escrita
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Arquivo gerado com sucesso: " + nomeArquivo);
        } catch (IOException e) {
            // Trata exceções de escrita no arquivo
            e.printStackTrace();
        }
    }
}
