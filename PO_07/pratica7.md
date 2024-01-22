# Sistema de Gerenciamento de Estudantes

## Estrutura do Estudante

- **Nome:** String
- **CPF:** String
- **CRA (Coeficiente de Rendimento Acadêmico):** Float
- **Ano de Admissão:** Int

## Funcionalidades

1. **Escrita em Arquivo (JSON):**
   - Solicita ao usuário inserir dados de vários estudantes.
   - Grava esses dados em um novo arquivo JSON chamado "estudantes.json".

2. **Leitura de Arquivo (JSON):**
   - Lê o arquivo "estudantes.json" e reconstrói a lista de estudantes.
   - Exibe o conteúdo do arquivo na saída padrão (console).

3. **Persistência de Dados com JSON:**
   - Toda vez que um novo dado é inserido, o programa salva no arquivo correspondente.
   - Quando algum dado é alterado, o arquivo é modificado para persistir a alteração.
   - Quando algum dado é excluído, o arquivo é modificado para persistir a alteração.
   - Na inicialização do programa, todos os dados dos arquivos são lidos para a memória.

## Arquivos

- **Estudante.java:** Definição da classe `Estudante`.
- **GravarEstudantes.java:** Funções para gravar estudantes em um arquivo JSON.
- **LerArquivo.java:** Funções para ler estudantes de um arquivo JSON.
- **Principal.java:** Programa principal com interação do usuário.

## Uso

1. Execute o programa.
2. Insira dados de estudantes.
3. Visualize, altere ou exclua estudantes.
4. Os dados são automaticamente salvos no arquivo "estudantes.json".
