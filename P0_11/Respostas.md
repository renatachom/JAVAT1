# PO_11 - PRÁTICA ORIENTADA
**Residente: Renata Chaves de Oliveira Moreno**

1. **Conceitos do padrão MVC**:
   - **Model**: Representa os dados da aplicação, sua estrutura e lógica de negócios. Ele não tem conhecimento sobre a interface do usuário.
   - **View**: É responsável pela apresentação dos dados ao usuário, geralmente na forma de uma interface gráfica. A View obtém os dados do Model.
   - **Controller**: Atua como intermediário entre o Model e a View, recebendo as entradas do usuário, processando as solicitações e atualizando o Model conforme necessário. Ele também atualiza a View com os dados do Model.

2. **Vantagens do padrão MVC**:
   - Separação de preocupações (concerns): Cada componente tem uma responsabilidade clara, facilitando a manutenção e o desenvolvimento em equipe.
   - Reutilização de código: Os componentes podem ser modificados ou substituídos independentemente uns dos outros.
   - Facilidade de teste: Como as responsabilidades estão separadas, é mais fácil testar cada componente individualmente.
   - Escalabilidade: A arquitetura modular facilita a expansão do sistema.

   Exemplo: Em uma aplicação web, a separação entre a lógica de negócios (Model), a interface do usuário (View) e o controle das interações do usuário (Controller) permite que diferentes equipes trabalhem em paralelo em áreas específicas sem interferir umas nas outras.

3. **Cenário hipotético de uma aplicação utilizando MVC**:
   - Suponha uma aplicação de lista de tarefas:
     - O Model seria responsável por armazenar e manipular as tarefas, como adicionar, remover e atualizar.
     - A View exibiria as tarefas em uma lista para o usuário.
     - O Controller lidaria com as solicitações do usuário, como adicionar ou excluir tarefas, atualizando o Model conforme necessário e atualizando a View para refletir as alterações.

4. **Facilitando manutenção e escalabilidade**:
   - Manutenção: Alterações em um componente não afetam diretamente os outros, facilitando a identificação e correção de bugs. Por exemplo, uma alteração na lógica de negócios (Model) não requer mudanças na interface do usuário (View).
   - Escalabilidade: Como os componentes são independentes, é mais fácil adicionar novos recursos ou modificar partes do sistema sem afetar o restante.

5. **Spring Boot**:
   - Spring Boot é um framework que simplifica o desenvolvimento de aplicativos Java, fornecendo configurações padrão para iniciar rapidamente projetos Spring com pouco ou nenhum esforço de configuração.

6. **Ciclo de vida de uma aplicação Spring Boot**:
   - **Inicialização**: Spring Boot inicia a aplicação, detecta automaticamente as dependências e configurações e prepara o ambiente de execução.
   - **Configuração**: Spring Boot aplica configurações padrão e personalizadas, como beans e propriedades.
   - **Execução**: A aplicação Spring Boot é executada e responde às solicitações dos clientes.

7. **Outros Frameworks para desenvolvimento de APIs Rest**:
   - **Django REST framework** (Python): Framework popular para construir APIs RESTful em Python.
   - **Express.js** (JavaScript/Node.js): Framework leve e flexível para construir APIs RESTful em Node.js.
   - **Ruby on Rails** (Ruby): Framework que inclui suporte para desenvolvimento de APIs RESTful em Ruby.

8. **Back end em Spring Boot e Front end em outras plataformas**:
   - Sim, uma aplicação desenvolvida com Spring Boot pode servir como back end para aplicações front end desenvolvidas em outras plataformas, como Angular, React ou Vue.js.
   - A relação com o protocolo HTTPS está na comunicação segura entre o cliente (front end) e o servidor (back end), independentemente das tecnologias utilizadas em cada extremidade. O Spring Boot, assim como outras tecnologias back end, pode ser configurado para suportar HTTPS para proteger a comunicação entre o cliente e o servidor.
