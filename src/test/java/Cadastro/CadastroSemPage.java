package Cadastro;

import DSL.DSL;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CadastroSemPage {
    private WebDriver navegador;
    private DSL dsl;
    private CampoTreinamentoPage page;

    @Before
    public void comecar() {
        System.setProperty("webdriver.chrome.driver","/home/carlos/drivers/chromedriver");
            navegador = new ChromeDriver();
            navegador.get("file:///home/carlos/Downloads/CursoSelenium/CursoSelenium/src/main/resources/componentes.html");
            dsl = new DSL(navegador);
            page = new CampoTreinamentoPage(navegador);
    }

    @Test
    public void testCadastrarInformacoes() {
        dsl.escrever("elementosForm:nome","Otto");
            Assert.assertEquals("Otto",dsl.obterValorCampo("elementosForm:nome"));

        dsl.escrever("elementosForm:sobrenome","Caldas");
        Assert.assertEquals("Caldas",dsl.obterValorCampo("elementosForm:sobrenome"));

        dsl.clicarRadio("elementosForm:sexo:0");
            Assert.assertTrue(dsl.isRadioMarcador("elementosForm:sexo:0"));

        dsl.clicarRadio("elementosForm:comidaFavorita:0");
            Assert.assertTrue(dsl.isRadioMarcador("elementosForm:comidaFavorita:0"));

        dsl.interagirCombo("elementosForm:escolaridade","Superior");
            Assert.assertEquals("Superior",dsl.obterValorCombo("elementosForm:escolaridade"));

        dsl.interagirCombo("elementosForm:esportes","Futebol");
            Assert.assertEquals("Futebol", dsl.obterValorCombo("elementosForm:esportes"));

        navegador.findElement(By.id("elementosform:cadastrar")).click();
    }

    @After
    public void finalizar() {
        navegador.quit();
    }
}
