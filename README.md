# <h1 align="center"> Instruções e orientações sobre automação WEB<h4 align="center"> 

- Para baixar as dependências e compilar o projeto basta utilizar o comando ```mvn clean install```

- Para geração de relatório é preciso usar dois comandos no terminal:
  - O primeiro é ```mvn test -Dtest=**/*RunCucumber -Dbrowser=chrome``` responsável por rodar todos os testes
  - O segundo é o ```mvn cluecumber-report:reporting``` que será responsável por gerar o relatório de fato


- O diretório ```common``` é utilizado para armazenar classes com funcionalidades comuns que são usadas em diversas partes do projeto, como por exemplo, classes que implementam funções para manipulação de strings, datas, formatação de dados, entre outras.


- O diretório ```commands``` é utilizado para armazenar classes que implementam ações específicas que são comumente utilizadas em diferentes partes do projeto, como por exemplo, classes que realizam interações com elementos da interface do usuário.


- O diretório ```utils``` é utilizado para armazenar classes que possuem funcionalidades auxiliares e que não se enquadram em nenhum dos outros diretórios. Essas classes podem implementar funções que são utilizadas para configurar o ambiente de teste, gerenciar arquivos de dados, gerar relatórios, entre outras.