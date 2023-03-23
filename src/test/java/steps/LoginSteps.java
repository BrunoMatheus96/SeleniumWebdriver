package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import runner.RunCucumber;
import org.openqa.selenium.JavascriptExecutor;

import static java.lang.Thread.sleep;

public class LoginSteps extends RunCucumber {

    LoginPage loginPage = new LoginPage();

    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login(){
        loginPage.acessarAplicao();
        loginPage.acessarTelaLogin();
    }

    @Quando("^preencho login \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void preencho_login_e_senha(String email, String senha){
        loginPage.preencheEmail(email);
        loginPage.preencherSenha(senha);
        loginPage.scrollDown();
        getDriver().findElement(By.id("btnLogin")).sendKeys(Keys.TAB);
    }

    @Quando("^clico em Login$")
    public void clico_em_Login() {
        loginPage.clicarLogin();
    }

    @Então("^vejo mensagem de login com sucesso$")
    public void vejo_mensagem_login_sucesso() {
        loginPage.verificaLoginSucesso();
    }

    @Então("^vejo mensagem \"([^\"]*)\" de campo não preenchido$")
    public void vejo_mensagem_de_campo_não_preenchido(String message) {
        loginPage.verificaCampoVazio(message);
    }

    @Quando("^acesso a tela de cadastro de usuário$")
    public void acesso_a_tela_de_cadastro_de_usuário() {
        loginPage.acessarTelaCadastro();
    }

    @Dado("^que estou logado na aplicação com user \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void que_estou_logado_na_aplicação_com_user_e_senha(String email, String senha) {
        loginPage.acessarAplicao();
        loginPage.acessarTelaLogin();
        loginPage.preencheEmail(email);
        loginPage.preencherSenha(senha);
        loginPage.clicarLogin();
        loginPage.verificaLoginSucesso();
    }

}
