package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;


public class LoginSteps {

	LoginPage lp = new LoginPage();
	
	/*@Dado("que eu acesse o sistema")
	public void queEuAcesseOSistema() {
	    acessarSistema();
	}*/

	@Quando("^eu informar no campo user \"([^\"]*)\"$")
	public void euInformarNoCampoUser(String nomeUsario) throws Throwable {
		//LoginPage lp = new LoginPage(driver);
		lp.informarCampoUser(nomeUsario);
	}
	
	@Quando("informar no campo senha {string}")
	public void informarNoCampoSenha(String password) {
		//LoginPage lp = new LoginPage(driver);
		lp.informarCampoPassword(password);
	}

	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
		//LoginPage lp = new LoginPage(driver);
		lp.acionarBotaoLogin();
	}

	@Entao("o sistema apresenta o usuario logado")
	public void oSistemaApresentaOUsuarioLogado() {
		//LoginPage lp = new LoginPage(driver);
		lp.validarUsuarioLogado();
	}
	
	@Entao("o sistema apresenta a mensagem de {string}")
	public void oSistemaApresentaAMensagemDe(String msgEsperada) {
		//LoginPage lp = new LoginPage(driver);
		lp.validarMensagemLogin(msgEsperada);
	}

	@Dado("^que eu realizei login$")
	public void queEuRealizeiLogin() throws Throwable {
		lp.fazerLogin();
	}

		
}