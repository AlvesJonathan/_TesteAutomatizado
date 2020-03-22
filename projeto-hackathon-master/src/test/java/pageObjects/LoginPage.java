package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Este é o construtor
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//ELEMENTOS
	@FindBy(id = "txtUsername")
	private WebElement campoUser;
	
	@FindBy(id = "txtPassword")
	private WebElement campoPassword;
	
	@FindBy(id = "btnLogin")
	private WebElement botaoLogin;
	
	@FindBy(id = "spanMessage")
	private WebElement mensagemLogin;
	
	@FindBy(id = "welcome")
	private WebElement usuarioLogado;
	
	
	//METODOS
	public void informarCampoUser(String nomeUsuario) {
		campoUser.sendKeys(nomeUsuario);
	//driver.findElement(By.id("txtUsername")).sendKeys("asdsd");
	}
	
	public void informarCampoPassword(String password) {
		campoPassword.sendKeys(password);
	}
	
	public void acionarBotaoLogin() {
		botaoLogin.click();
	}
	
	public void validarMensagemLogin(String msgEsperada) {
		assertEquals(msgEsperada, mensagemLogin.getText());
	}
	
	public void validarUsuarioLogado() {
		assertEquals("Welcome Admin", usuarioLogado.getText());
	}
	
	public void fazerLogin() {
		informarCampoUser("Admin");
		informarCampoPassword("admin123");
		acionarBotaoLogin();
	}

}










