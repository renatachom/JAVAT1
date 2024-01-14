package pratica.orientada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {

    public static void main(String[] args) {
        String nomeArquivo = "entrada.txt";

        try {
            FileReader fileReader = new FileReader(nomeArquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;

            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            // Trata exceções de leitura do arquivo
            System.err.println("Erro: Não foi possível encontrar o arquivo '" + nomeArquivo + "'.");
            System.err.println("Certifique-se de que o arquivo está no mesmo diretório do programa ou forneça o caminho completo.");
            e.printStackTrace();
        }
    }
}
