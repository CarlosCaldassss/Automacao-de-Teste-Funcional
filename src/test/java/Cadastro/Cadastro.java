package Cadastro;

import DSL.DSL;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Cadastro {
    private WebDriver navegador;
    private DSL dsl;
    private CampoTreinamentoPage page;

    @Before
    public void comecar() {
        System.setProperty("webdriver.chrome.driver","/home/carlos/drivers/chromedriver");
            navegador = new ChromeDriver();
            navegador.get("file:///"+System.getProperty("user.dir")+"/src/main/resources/componentes.html");
            dsl = new DSL(navegador);
            page = new CampoTreinamentoPage(navegador);
    }

    @Test
    public void testCadastrarInformacoes() {
        //Preenchendo os campos no formulário;
        page.setNome("Otto");
        page.setSobrenome("Caldas");
        page.setSexoMasculino();
        page.setComidaCarne();
        page.setEscSuperior("Superior");
        page.setEsporte("Futebol");
        page.setCadastrar();

        //Verificação;
        Assert.assertEquals("Otto",page.setObterNomeCadastro());
        Assert.assertEquals("Caldas",page.setObterSobrenomeCadastro());
        Assert.assertTrue(page.setObterCampoSexo());
        Assert.assertTrue(page.setObterCampoComida());
        Assert.assertEquals("Superior",page.setObterCampoEscolaridade());
        Assert.assertEquals("Futebol",page.setObterValorEsporte());

    }
    @After
    public void finalizar() {
        navegador.quit();
    }

}
