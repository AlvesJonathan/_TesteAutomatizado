package stepsDefinitions;

import static utils.Utils.acessarSistema;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.PesquisarPage;

public class PesquisarSteps {
	
	PesquisarPage pp = new PesquisarPage();
	
	@Quando("acionar o botao Directory")
	public void acionarOBotaoDirectory() {
	    pp.menuDirectory();
	}

	@Quando("preencher o campo Name {string}")
	public void preencherOCampoName(String name) {
	    pp.preencherCampoName(name);
	}

	@Quando("clicar no botao Search")
	public void clicarNoBotaoSearch() {
	    pp.acionarBotaoSearch();
	}

	@Entao("o sistema apresenta a pesquisa com sucesso")
	public void oSistemaApresentaAPesquisaComSucesso() {
	    
	}

	@Dado("^que eu acesse o sistema$")
	public void queEuAcesseOSistema() throws Throwable {
		acessarSistema();
	}

}
