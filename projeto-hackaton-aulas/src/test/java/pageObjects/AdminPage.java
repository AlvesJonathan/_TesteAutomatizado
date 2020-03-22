package pageObjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage {
	
	WebDriverWait espera = new WebDriverWait(driver, 10);

	public AdminPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement menuAdmin;
	
	@FindBy(id = "menu_admin_UserManagement")
	public WebElement userManagement;
	
	@FindBy(id = "menu_admin_viewSystemUsers")
	public WebElement subMenuUser;
	
	@FindBy(xpath = "//h1[.='System Users']")
	public WebElement telaSystemUser;
	
	@FindBy(id = "searchSystemUser_userName")
	public WebElement userName;

	@FindBy(name = "_search")
	public WebElement botaoSearch;

	@FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr/td[3]" )
	public WebElement primeiroResultadoLista;
	
	@FindBy(name ="searchSystemUser[userType]")
	public WebElement selectUserRole;

	// Metodos
	public void acessarMenuAdmin() throws Exception {
		espera.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_admin_viewAdminModule")));
		menuAdmin.click();
	}

	public void preencherUserName() {
		this.userName.sendKeys(primeiroResultadoLista.getText());
	}

	public void acionarBotaoSearch() {
		botaoSearch.click();
	}
	
	public void selecionarUserRole(String option) {
		Select select = new Select(selectUserRole);
		select.selectByVisibleText(option);
	}

	// Validacoes

	public void validarConsultaUserName() {
		assertEquals(userName.getAttribute("value"), primeiroResultadoLista.getText());
	}
	
	public void validarConsultaUserRole(String option) {
		Select select = new Select(selectUserRole);
		select.selectByVisibleText(option);
	}
	
	public void conhecendoJavascript() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert(\"Ola Hackathon!!\")", "0");
	}
	
	public void moverMouse() {
		Actions acao = new Actions(driver);
		acao.moveToElement(menuAdmin);
		acao.moveToElement(userManagement);
		subMenuUser.click();
	}
	
	public void validarTelaSystemUser() {
		espera.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[.='System Users']")));
		assertTrue(telaSystemUser.isDisplayed());
	}
	

}