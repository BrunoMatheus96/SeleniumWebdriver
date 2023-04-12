# zap-automation-test-web

<h4 align="center"> 
    :construction:  Projeto em construção  :construction:
</h4>

<h2> Informações para quem não tem a IDE Intellij no computador </h2>
Projeto de automação de testes Web, utilizando o framework Selenium.

O Selenium é uma ferramenta de automação de testes funcionais para aplicações web. Ele permite que você escreva scripts em diversas linguagens de programação (como Java, Python, Ruby, entre outras) que podem ser executados em navegadores web reais (como Chrome, Firefox, Edge, entre outros) ou em headless browsers (navegadores sem interface gráfica). Com o Selenium, é possível simular a interação do usuário com a aplicação web, como cliques em botões, preenchimento de formulários, navegação em páginas, entre outras ações. Isso permite que você crie testes automatizados para garantir que sua aplicação esteja funcionando corretamente em diferentes cenários, aumentando a qualidade e a confiabilidade do software.

Como instalar e executar utilizando a arquitetura:

1 - Instalar o Java Development Kit (JDK) - o Selenium requer o Java para ser executado. Você pode baixar o JDK no site da Oracle e instalar seguindo as instruções do instalador.

2 - Baixar e instalar o Intellij IDEA - você pode baixar a última versão do Intellij IDEA no site oficial e seguir as instruções de instalação.

3 - Baixar e instalar o Maven.

4 - Baixar as dependências e compilar o projeto utilizando o comando ```mvn clean install```


<h2> Comandos para gerar relatório </h2>

- Para geração de relatório é preciso usar dois comandos no terminal:
  - O primeiro é ```mvn test -Dtest=**/*RunCucumber -Dbrowser=chrome``` responsável por rodar todos os testes
  - O segundo é o ```mvn cluecumber-report:reporting``` que será responsável por gerar o relatório de fato


<h2> Informações sobre a arquitetura de automação Web </h2>

- O diretório ```common``` é utilizado para armazenar classes com funcionalidades comuns que são usadas em diversas partes do projeto, como por exemplo, classes que implementam funções para manipulação de strings, datas, formatação de dados, entre outras.


- O diretório ```commands``` é utilizado para armazenar classes que implementam ações específicas que são comumente utilizadas em diferentes partes do projeto, como por exemplo, classes que realizam interações com elementos da interface do usuário.


- O diretório ```utils``` é utilizado para armazenar classes que possuem funcionalidades auxiliares e que não se enquadram em nenhum dos outros diretórios. Essas classes podem implementar funções que são utilizadas para configurar o ambiente de teste, gerenciar arquivos de dados, gerar relatórios, entre outras.
