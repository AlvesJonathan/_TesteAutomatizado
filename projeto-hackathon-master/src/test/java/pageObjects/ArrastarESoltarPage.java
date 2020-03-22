package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArrastarESoltarPage {

	// CONSTRUTOR
	public ArrastarESoltarPage() {
		PageFactory.initElements(driver, this);
	}
	
	// ELEMENTOS
	@FindBy(id = "draggable")
	public WebElement caixaPequena;
	
	@FindBy(id = "droppable")
	public WebElement caixaGrande;
	
	//METODOS
	
	public void arrastarESoltar() {
		Actions acao = new Actions(driver);
		acao.dragAndDrop(caixaPequena, caixaGrande).build().perform();
	}
	
	public void verificarMensagemArrastou() {
		assertEquals("Dropped!", caixaGrande.getText());
	}
	
}








