// CadastroCliente.java
package ValidadorIdade;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class CadastroCliente {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a data de nascimento (YYYY-MM-DD): ");
            String dataNascimentoStr = scanner.nextLine();

            try {
                LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);
                LocalDate dataAtual = LocalDate.now();
                
                int idade = Period.between(dataNascimento, dataAtual).getYears();

                // Versão Checada
                ValidadorIdade.validarIdade(idade);

                // Ou Versão Não Checada
                // ValidadorIdade.validarIdade(idade);
                
                System.out.println("Cadastro do cliente realizado com sucesso!");
            } catch (IdadeInvalidaException | IdadeInvalidaRuntimeException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}

