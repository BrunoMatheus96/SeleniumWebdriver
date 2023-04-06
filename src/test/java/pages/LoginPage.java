package pages;

import org.openqa.selenium.By;
import runner.RunCucumber;

import static support.Commands.*;

public class LoginPage extends RunCucumber {

    // elementos
    private String URL = "http://automationpratice.com.br/";
    private By botaoAcessarLogin = By.cssSelector(".right_list_fix > li > a > .fa-user");
    private By campoEmail = By.id("user");
    private By campoSenha = By.id("password");
    private By botaoFazerLogin = By.id("btnLogin");
    private By botaoAcessarCadastro = By.cssSelector(".right_list_fix > li > a > .fa-lock");

    // ações / funções / métodos
    public void acessarAplicao() {
        getDriver("chrome").get(URL);
    }

    public void acessarTelaLogin() {
        //getDriver().findElement(botaoAcessarLogin).click();
        clickElement(botaoAcessarLogin);
    }

    public void preencheEmail(String email) {
        //getDriver().findElement(campoEmail).sendKeys(email);
        fillField(campoEmail, email);
    }

    public void preencherSenha(String senha) {
        //getDriver().findElement(campoSenha).sendKeys(senha);
        fillField(campoSenha, senha);
    }

    public void clicarLogin() {
        //getDriver().findElement(botaoFazerLogin).click();
        clickElement(botaoFazerLogin);
    }

    public void verificaLoginSucesso() {
        //waitElementBeVisible(By.id("swal2-title"), 5000);
        //String textoLoginSucesso = getDriver().findElement(By.id("swal2-title")).getText();
        //Assert.assertEquals("Login realizado", textoLoginSucesso);
        checkMessage(By.id("swal2-title"), "Login realizado");
    }

    public void verificaCampoVazio(String message) {
        //String textError = getDriver().findElement(By.className("invalid_input")).getText();
        //Assert.assertEquals(message, textError);
        checkMessage(By.className("invalid_input"), message);
    }

    //Ainda não tem cenário
    public void acessarTelaCadastro() {
        //getDriver().findElement(botaoAcessarCadastro).click();
        clickElement(botaoAcessarCadastro);
    }
}
