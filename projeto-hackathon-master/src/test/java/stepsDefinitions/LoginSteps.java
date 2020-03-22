package stepsDefinitions;

import static utils.Utils.acessarSistema;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;


public class LoginSteps {

	LoginPage lp =  new LoginPage();
	
	//Maneira de fazer o init
	//LoginPage lp = PageFactory.initElements(driver, LoginPage.class);

	@Quando("^eu informar no campo user \"([^\"]*)\"$")
	public void euInformarNoCampoUser(String nomeUsario) throws Throwable {
		lp.informarCampoUser(nomeUsario);
	}
	
	@Quando("informar no campo senha {string}")
	public void informarNoCampoSenha(String password) {
		lp.informarCampoPassword(password);
	}

	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
		lp.acionarBotaoLogin();
	}

	@Entao("o sistema apresenta o usuario logado")
	public void oSistemaApresentaOUsuarioLogado() {
		lp.validarUsuarioLogado();
	}
	
	@Entao("o sistema apresenta a mensagem de {string}")
	public void oSistemaApresentaAMensagemDe(String msgEsperada) {
		lp.validarMensagemLogin(msgEsperada);
	}

	@Dado("^que eu realizei login$")
	public void queEuRealizeiLogin() throws Throwable {
		lp.fazerLogin();
	}

	@Dado("^que eu acesse o sistema$")
	public void queEuAcesseOSistema() throws Throwable {
		acessarSistema();
	}
	
	
}
