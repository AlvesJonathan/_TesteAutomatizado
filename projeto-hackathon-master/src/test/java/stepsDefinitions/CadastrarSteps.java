package stepsDefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarPage;

public class CadastrarSteps {
	
	CadastrarPage cadastrarPage = new CadastrarPage();
	
	@Quando("eu preencher o campo Employer name {string}")
	public void euPreencherOCampoEmployerName(String string) {
		cadastrarPage.informarCampoEmployeeName(string);
	}

	@Quando("preencher o campo user name {string}")
	public void preencherOCampoUserName(String string) {
		cadastrarPage.informarCampoUserName(string);
	}

	@Quando("preencher o campo password {string}")
	public void preencherOCampoPassword(String string) {
		cadastrarPage.informarCampoPassword(string);
	}

	@Quando("preencher o campo confirm password {string}")
	public void preencherOCampoConfirmPassword(String string) {
		cadastrarPage.informarCampoConfirmarPassword(string);
	}

	@Entao("o sistema apresenta o usuario cadastro {string}")
	public void oSistemaApresentaOUsuarioCadastro(String string) {
	    cadastrarPage.validarUsuarioCadastrado(string);
	}

	@E("^clicar no botao salvar$")
	public void clicarNoBotaoSalvar() throws Throwable {
		cadastrarPage.clicarNoBotaoSalvar();
	}

}
