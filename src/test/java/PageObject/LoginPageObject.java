package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPageObject {
	WebDriver driver;

	final String CampoUsuario = "//*[@id=\"username\"]";
	final String CampoSenha = "//*[@id=\"password\"]";
	final String Tarefa = "//*[@id=\"navbar-container\"]/div[2]/ul[1]/li[1]/div[1]/a[1]";
	final String SelecionaProjeto = "select-project-id";
	final String BtnSelecionaProjeto = "//*[@id=\"select-project-form\"]/div[1]/div[2]/div[2]/input[1]";
	final String SelecionaCategoria = "category_id";
	final String SelecionaFrequencia = "reproducibility";
	final String SelecionaPrioridade = "priority";
	final String CampoResumo = "summary";
	final String CampoDescricao = "description";
	final String CampoPassos = "steps_to_reproduce";
	final String EnvioArquivo = "//*[@id=\"report_bug_form\"]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[11]/td[1]/div[2]";
	final String CriarTarefa = "//*[@id=\"report_bug_form\"]/div[1]/div[2]/div[2]/input[1]";


	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
		driver.manage().window().maximize();

	}

	public void insereUsuario(String usuario) {
		driver.findElement(By.xpath(CampoUsuario)).sendKeys(usuario);
		driver.findElement(By.xpath(CampoUsuario)).sendKeys(Keys.ENTER);		
	}

	public void insereSenha(String senha) {
		driver.findElement(By.xpath(CampoSenha)).sendKeys(senha);
		driver.findElement(By.xpath(CampoSenha)).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void criarTarefa(String tarefa) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Tarefa)).click();
	}

	/*public void selecionaProjeto(String projeto) {
		WebElement ddown = driver.findElement(By.id(SelecionaProjeto));
		Select select = new Select(ddown);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		select.selectByValue("63");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void BtnselecionaProj(String tbnselecproj) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(BtnSelecionaProjeto)).click();
	} */
	
	public void selecionaCategoria(String categoria) {
		WebElement ddown = driver.findElement(By.id(SelecionaCategoria));
		Select select = new Select(ddown);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		select.selectByValue("2");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void selecionaFrequencia(String frequencia) {
		WebElement ddown = driver.findElement(By.id(SelecionaFrequencia));
		Select select = new Select(ddown);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		select.selectByValue("50");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void selecionaPrioridade(String prioridade) {
		WebElement ddown = driver.findElement(By.id(SelecionaPrioridade));
		Select select = new Select(ddown);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		select.selectByValue("40");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
	}
	
	public void preencheResumo(String resumo) {
		driver.findElement(By.id(CampoResumo)).sendKeys(resumo);
		driver.findElement(By.id(CampoResumo)).sendKeys(Keys.ENTER);
		}
	
	
	public void preencheDescricao(String descricao) {
		driver.findElement(By.id(CampoDescricao)).sendKeys(descricao);
		driver.findElement(By.id(CampoDescricao)).sendKeys(Keys.ENTER);
		}
	
	public void preenchePassos(String passos) {
		driver.findElement(By.id(CampoPassos)).sendKeys(passos);
		driver.findElement(By.id(CampoPassos)).sendKeys(Keys.ENTER);
		}
	
	/*public void enviarArquivo(String arquivo) {
		WebElement addFile = driver.findElement(By.xpath(EnvioArquivo));
		addFile.sendKeys("C:/Users/wagne/eclipse-workspace/mantis/Captura de Tela (2).png");
	//	driver.findElement(By.xpath(EnvioArquivo)).click();
	//	driver.findElement(By.xpath(EnvioArquivo)).sendKeys("C:\\Users\\wagne\\eclipse-workspace\\mantis\\Captura de Tela (2).png");
	}*/
	
	public void criarTarefaBtn(String criartarefa) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(CriarTarefa)).click();
	}

	
	
	/*
	public void aguarda() {

		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}*/
}
