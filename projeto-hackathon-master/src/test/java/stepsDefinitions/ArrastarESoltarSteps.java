package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ArrastarESoltarPage;

public class ArrastarESoltarSteps {
	
	ArrastarESoltarPage arrastarPage = new ArrastarESoltarPage();
	
	@Quando("eu arrastar um objeto sobre o outro")
	public void euArrastarUmObjetoSobreOOutro() {
		arrastarPage.arrastarESoltar();
	}

	@Entao("o sistema apresenta a mensagem arrastou")
	public void oSistemaApresentaAMensagemArrastou() {
		arrastarPage.verificarMensagemArrastou();
	}

}
