package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObject.LoginPageObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;

public class StepsMantis {
	WebDriver driver;

	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Dado("^que esteja na página: \"([^\"]*)\"$")
	public void que_esteja_na_página(String url) {
		driver.get(url);
		System.out.println("**Site aberto com sucesso!!!");	
	}
	
	@Quando("informo o usuario {string}")
	public void informo_o_usuario(String usuario) {
		LoginPageObject loginPageObject = new LoginPageObject(driver);
		loginPageObject.insereUsuario(usuario);
		System.out.println("**Usuario informado com sucesso!!!");	
	}

	@Então("informo a senha {string} e entro")
	public void senha(String senha) {
		LoginPageObject loginPageObject = new LoginPageObject(driver);
		loginPageObject.insereSenha(senha);
		System.out.println("**Senha informada com sucesso!!!");	
	}

	@Então("que seleciono criar tarefa:{string}")
	public void que_seleciono_criar_tarefa(String tarefa) {
		LoginPageObject loginPageObject = new LoginPageObject(driver);
		loginPageObject.criarTarefa(tarefa);
		System.out.println("**Botao criar tarefa acionado com sucesso!!!");	
	}
	
	/*@Então("seleciono o projeto: {string}")
	public void seleciono_o_projeto(String ddown) {
		LoginPageObject loginPageObject = new LoginPageObject(driver);
		loginPageObject.selecionaProjeto(ddown);
		System.out.println("**Selecionado projeto Wagner com sucesso!!!");
	}
	
	@Então("seleciono o botao para avancar: {string}")
	public void seleciono_o_botao_para_avancar(String tbnselecproj) {
		LoginPageObject loginPageObject = new LoginPageObject(driver);
		loginPageObject.BtnselecionaProj(tbnselecproj);
		System.out.println("**Botao selecionar projeto acionado com sucesso!!!");		
	} */

	@Então("seleciono a categoria: {string}")
	public void seleciono_a_categoria(String ddown) {
		LoginPageObject loginPageObject = new LoginPageObject(driver);
		loginPageObject.selecionaCategoria(ddown);
		System.out.println("**Categoria selecionada com sucesso!!!");		
	}

	@Então("seleciono a frequencia: {string}")
	public void seleciono_a_frequencia(String ddown) {
		LoginPageObject loginPageObject = new LoginPageObject(driver);
		loginPageObject.selecionaFrequencia(ddown);
		System.out.println("**Frequencia selecionada com sucesso!!!");		
	}

	@Então("seleciono a prioridade: {string}")
	public void seleciono_a_prioridade(String ddown) {
		LoginPageObject loginPageObject = new LoginPageObject(driver);
		loginPageObject.selecionaPrioridade(ddown);
		System.out.println("**Prioridade selecionada com sucesso!!!");		
	}
	
	@Então("informo o resumo: {string}")
	public void informo_o_resumo(String resumo) {
		LoginPageObject loginPageObject = new LoginPageObject(driver);
		loginPageObject.preencheResumo(resumo);		
		System.out.println("**Resumo informado com sucesso!!!");		
	}
	
	@Então("informo a descricao:  {string}")
	public void informo_a_descricao(String descricao) {
		LoginPageObject loginPageObject = new LoginPageObject(driver);
		loginPageObject.preencheDescricao(descricao);
		System.out.println("**Descricao informada com sucesso!!!");		
	}
	
	@Então("informo os passos para reproduzir: {string}")
	public void informo_os_passos_para_reproduzir(String passos) {
		LoginPageObject loginPageObject = new LoginPageObject(driver);
		loginPageObject.preenchePassos(passos);
		System.out.println("**Passos informados com sucesso!!!");		
	}
	
	/*@Então("envio o arquivo: {string}")
	public void envio_o_arquivo(String arquivo) {
		LoginPageObject loginPageObject = new LoginPageObject(driver);
		loginPageObject.enviarArquivo(arquivo);
	}*/
	
	@Quando("seleciono o botao: {string}")
	public void seleciono_o_botao(String criartarefa) {
		LoginPageObject loginPageObject = new LoginPageObject(driver);
		//loginPageObject.criarTarefaBtn(criartarefa);
		System.out.println("**Tarefa criada com sucesso!!!");				
	}

	@After
	public void after() {
		driver.quit();
	}


}
