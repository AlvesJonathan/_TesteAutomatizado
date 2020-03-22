package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.PesquisarPage;

public class PesquisarSteps {
	
	PesquisarPage pp = new PesquisarPage();
	
	@Dado("^que eu acesso o menu Directory$")
	public void queEuAcessoOMenuDirectory() throws Throwable {
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

	

}
