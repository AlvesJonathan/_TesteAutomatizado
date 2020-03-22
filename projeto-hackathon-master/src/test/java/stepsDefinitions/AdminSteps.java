package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.AdminPage;

public class AdminSteps {
	AdminPage adminPage = new AdminPage();

	@Dado("que eu acesse o menu Admin")
	public void queEuAcesseOMenuAdmin() throws Exception {
		adminPage.acessarMenuAdmin();
	}

	@Quando("^eu preencher o campo Username$")
	public void euPreencherOCampoUsername() throws Throwable {
		adminPage.preencherUserName();
	}

	@E("^acionar o botao Search$")
	public void acionarOBotaoSearch() throws Throwable {
		adminPage.acionarBotaoSearch();
	}

	@Entao("^o sistema realizara a consulta com sucesso$")
	public void oSistemaRealizaraAConsultaComSucesso() throws Throwable {
		adminPage.validarConsultaUserName();
	}

	@Quando("^eu selecionar a combo userRole com \"([^\"]*)\"$")
	public void euSelecionarAComboUserRoleCom(String option) throws Throwable {
		adminPage.selecionarUserRole(option);
	}

	@Entao("^o sistema realiza a consulta do userRole com sucesso$")
	public void oSistemaRealizaAConsultaDoUserRoleComSucesso() throws Throwable {
		adminPage.validarConsultaUserRole();
		
	}

	@Quando("^eu acessar o submenu user$")
	public void euAcessarOSubmenuUser() throws Throwable {
		adminPage.moverMouseParaElementos();
	}

	@Entao("^o sistema apresenta a tela de system user$")
	public void oSistemaApresentaATelaDeSystemUser() throws Throwable {
		adminPage.validarTelaSystemUser();
	}

	@E("^clicar no botao add$")
	public void clicarNoBotaoAdd() throws Throwable {
		adminPage.clicarBotaoAdd();
	}
}
