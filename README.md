# SeleniumWebdriver
- Para geração de relatório é preciso usar dois comandos no terminal
  - O primeiro é ```mvn test -Dtest=**/*RunCucumber -Dbrowser=chrome``` responsável por rodar todos os testes
  - O segundo é o ```mvn cluecumber-report:reporting``` que será responsável por gerar o relatório de fato


 - A pasta "pages" será um "common" onde podemos criar uma classe que os códios serão usados em vários cenários,
mas de apenas uma feature ou podemos criar uma classe que os códigos serão usados em vários cenários de 
várias features diferentes;
 - A classe "Utils" que se enconta na pasa "support"é utilizada para códigos que 
podem ser uteis nos cenários, independente da feature.