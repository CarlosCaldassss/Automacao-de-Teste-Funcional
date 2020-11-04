package RegrasDeNegocio;

import org.junit.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestRegrasDeNegocio {
    private WebDriver navegador;
    @Before
    public void iniciar() {
        System.setProperty("webdriver.chrome.driver","/home/carlos/drivers/chromedriver");
        navegador = new ChromeDriver();
        navegador.get("file:///"+System.getProperty("user.dir")+"/src/main/resources/componentes.html");
    }
    @Test
    public void testNomeObrigatorio() {
        navegador.findElement(By.id("elementosForm:cadastrar")).click();
        Alert alert = navegador.switchTo().alert();
        Assert.assertEquals("Nome eh obrigatorio",alert.getText());
        alert.accept();
    }
    @Test
    public void testSobrenomeObrigatorio() {
        navegador.findElement(By.id("elementosForm:nome")).sendKeys("Otto");
        navegador.findElement(By.id("elementosForm:cadastrar")).click();
        Alert alert = navegador.switchTo().alert();
        Assert.assertEquals("Sobrenome eh obrigatorio", alert.getText());
        alert.accept();
    }
    @Test
    public void testSexoEObrigatorio() {
        navegador.findElement(By.id("elementosForm:nome")).sendKeys("Otto");
        navegador.findElement(By.id("elementosForm:sobrenome")).sendKeys("Caldas");
        navegador.findElement(By.id("elementosForm:cadastrar")).click();
        Alert alert = navegador.switchTo().alert();
        Assert.assertEquals("Sexo eh obrigatorio",alert.getText());
    }
    @Test
    public void testEVegetariano() {
        navegador.findElement(By.id("elementosForm:nome")).sendKeys("Otto");
        navegador.findElement(By.id("elementosForm:sobrenome")).sendKeys("Caldas");
        navegador.findElement(By.id("elementosForm:sexo:0")).click();
        navegador.findElement(By.id("elementosForm:sexo:0")).isSelected();

        navegador.findElement(By.id("elementosForm:comidaFavorita:0")).click();
        boolean comeCarne = navegador.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected();
            Assert.assertTrue(comeCarne);
        navegador.findElement(By.id("elementosForm:comidaFavorita:3")).click();
        boolean ncomeCarne = navegador.findElement(By.id("elementosForm:comidaFavorita:3")).isSelected();
            Assert.assertTrue(ncomeCarne);
        navegador.findElement(By.id("elementosForm:cadastrar")).click();
        Alert alert = navegador.switchTo().alert();
        Assert.assertEquals("Tem certeza que voce eh vegetariano?", alert.getText());
        alert.accept();
    }
    @Test
    public void testPraticaEsportes() {
        navegador.findElement(By.id("elementosForm:nome")).sendKeys("Otto");
        navegador.findElement(By.id("elementosForm:sobrenome")).sendKeys("Caldas");
        navegador.findElement(By.id("elementosForm:sexo:0")).click();
        navegador.findElement(By.id("elementosForm:sexo:0")).isSelected();
        navegador.findElement(By.id("elementosForm:comidaFavorita:0")).click();
        navegador.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected();

        WebElement element = navegador.findElement(By.id("elementosForm:esportes"));
        Select combo = new Select(element);
        combo.selectByVisibleText("Futebol");
        combo.selectByVisibleText("O que eh esporte?");

        navegador.findElement(By.id("elementosForm:cadastrar")).click();

        Alert alert = navegador.switchTo().alert();
            Assert.assertEquals("Voce faz esporte ou nao?",alert.getText());
        alert.accept();
    }
    @After
    public void finalizar() {
        navegador.quit();
    }

}
