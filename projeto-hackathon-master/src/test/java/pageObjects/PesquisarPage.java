package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PesquisarPage {
	
	//CONSTRUTOR
	public PesquisarPage() {
		PageFactory.initElements(driver, this);
	}
	
	//ELEMENTOS
	@FindBy(id = "menu_directory_viewDirectory")
	public WebElement menuDirectory;
	
	@FindBy(name = "searchDirectory[emp_name][empName]")
	public WebElement campoName;
	
	@FindBy(id = "searchBtn")
	public WebElement botaoSearch;
	
	
	//METODOS
	public void menuDirectory() {
		menuDirectory.click();
	}
	
	public void preencherCampoName(String name) {
		campoName.sendKeys(name);
	}
	
	public void acionarBotaoSearch() {
		botaoSearch.click();
	}
	

}
