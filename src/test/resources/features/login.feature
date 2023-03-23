# language: pt

@login
Funcionalidade: Login
  Eu como usuário do sistema
  Quero fazer login
  Para fazer uma compra no site

  Contexto: acessar tela de login
    Dado que estou na tela de login

  @login-sucesso
  Cenário: Login com sucesso
    Quando preencho login "eduardo.finotti@qazando.com" e senha "123456"
    E clico em Login
    Então vejo mensagem de login com sucesso

    #Cenário 2
  @focus
  Esquema do Cenario: Campo email inválido e senha inválida
    Quando preencho login <login> e senha <senha>
    E clico em Login
    Então vejo mensagem <response> de campo não preenchido

    Exemplos:
      | login                         | senha    | response           |
      | "eduardo"                     | "123456" | "E-mail inválido." |
      | "eduardo.finotti@qazando.com" | "123"    | "Senha inválida."  |



