package DSL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DSL {
    private WebDriver navegador;

    public DSL(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void escrever(String id_campo, String texto) {
        navegador.findElement(By.id(id_campo)).sendKeys(texto);
    }

    public String obterValorCampo(String id_campo) {
        return navegador.findElement(By.id(id_campo)).getAttribute("value");
    }

    public void clicarRadio(String id_campo) {
        navegador.findElement(By.id(id_campo)).click();
    }

    public boolean isRadioMarcador(String id_campo) {
        return navegador.findElement(By.id(id_campo)).isSelected();
    }

    public void interagirCombo(String id, String texto) {
        WebElement element = navegador.findElement(By.id(id));
        Select combo = new Select(element);
        List<WebElement> options = combo.getOptions();
        combo.selectByVisibleText(texto);
    }

    public String obterValorCombo(String id) {
        WebElement element = navegador.findElement(By.id(id));
        Select combo = new Select(element);
        return combo.getFirstSelectedOption().getText();
    }
    public void Cadastrar(String id_campo) {
        navegador.findElement(By.id(id_campo)).click();
    }

}
