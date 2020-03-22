package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {
	
	LoginPage lp = new LoginPage();

	@Dado("^que eu acesse o sistema$")
	public void queEuAcesseOSistema() throws Throwable {
	}
	
	@Quando("eu informar no campo user {string}")
	public void euInformarNoCampoUser(String nomeUsuario) {
	    lp.informarCampoUser(nomeUsuario);
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
	public void oSistemaApresentaOUsuarioLogado(String msgEsperada) {
	    lp.validarMensagemLogin(msgEsperada);
	}
		

}
