package pageObjects;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastrarPage {
	
	public CadastrarPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "systemUser_employeeName_empName")
	public WebElement campoEmployeeName;
	
	@FindBy(id = "systemUser_userName")
	public WebElement campoUserName;
	
	@FindBy(id = "systemUser_password")
	public WebElement campoPassword;
	
	@FindBy(id = "systemUser_confirmPassword")
	public WebElement campoConfirmarPassword;
	
	@FindBy(id = "btnSave")
	public WebElement botaoSalvar;
	
	
	public void informarCampoEmployeeName(String string) {
		campoEmployeeName.sendKeys(string);
	}
	
	public void informarCampoUserName(String string) {
		campoUserName.sendKeys(string);
	}
	
	public void informarCampoPassword(String string) {
		campoPassword.sendKeys(string);
	}
	
	public void informarCampoConfirmarPassword(String string) {
		campoConfirmarPassword.sendKeys("asdas");
	}
	
	public void clicarNoBotaoSalvar() {
		botaoSalvar.click();
	}
	
	public void validarUsuarioCadastrado(String string) {
		assertTrue(driver.findElement(By.xpath("//a[.='" + string +"']")).isDisplayed());
	}

}
















