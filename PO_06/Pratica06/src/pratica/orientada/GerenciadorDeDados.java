package pratica.orientada;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Exceção personalizada para indicar que o arquivo não foi encontrado
class ArquivoNaoEncontradoException extends Exception {
    public ArquivoNaoEncontradoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}

public class GerenciadorDeDados {

    private static final String ARQUIVO = "dados.txt";

    public static void main(String[] args) {
        // Verifica se o arquivo existe, e cria se não existir
        verificarEInicializarArquivo();

        List<String> dados;
        try {
            dados = lerDadosDoArquivo();
        } catch (ArquivoNaoEncontradoException e) {
            System.err.println(e.getMessage());
            return; // Termina o programa se o arquivo não for encontrado
        }

        // Exibe os dados atuais
        System.out.println("Dados Atuais: ");
        for (String dado : dados) {
            System.out.println(dado);
        }

        // Permite ao usuário adicionar novos dados
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um novo dado: ");
        String novoDado = scanner.nextLine();
        adicionarDado(dados, novoDado);

        // Exibe os dados atualizados
        System.out.println("Dados Atualizados: ");
        for (String dado : dados) {
            System.out.println(dado);
        }

        // Salva os dados no arquivo
        salvarDadosNoArquivo(dados);

        // Fecha o scanner
        scanner.close();
    }

    private static void verificarEInicializarArquivo() {
        File arquivo = new File(ARQUIVO);
        if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();
                System.out.println("Arquivo criado com sucesso: " + ARQUIVO);
            } catch (IOException e) {
                System.err.println("Erro ao criar o arquivo: " + ARQUIVO);
                e.printStackTrace();
            }
        }
    }

    private static List<String> lerDadosDoArquivo() throws ArquivoNaoEncontradoException {
        List<String> dados = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                dados.add(linha);
            }
        } catch (FileNotFoundException e) {
            throw new ArquivoNaoEncontradoException("O arquivo '" + ARQUIVO + "' não foi encontrado.", e);
        } catch (IOException e) {
            // Trata exceções de leitura do arquivo
            e.printStackTrace();
        }

        return dados;
    }

    private static void adicionarDado(List<String> dados, String novoDado) {
        dados.add(novoDado);
        System.out.println("Novo dado adicionado: " + novoDado);
    }

    private static void salvarDadosNoArquivo(List<String> dados) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (String dado : dados) {
                bufferedWriter.write(dado);
                bufferedWriter.newLine();
            }
            System.out.println("Dados salvos no arquivo: " + ARQUIVO);
        } catch (IOException e) {
            // Trata exceções de escrita no arquivo
            e.printStackTrace();
        }
    }
}
