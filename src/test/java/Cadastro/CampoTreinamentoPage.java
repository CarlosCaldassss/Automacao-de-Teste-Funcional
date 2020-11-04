package Cadastro;

import DSL.DSL;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CampoTreinamentoPage {

    private DSL dsl;

    public CampoTreinamentoPage(WebDriver navegador) {
        dsl = new DSL(navegador);
    }
    public void setNome(String nome) {
        dsl.escrever("elementosForm:nome", nome);
    }
    public void setSobrenome(String sobrenome) {
        dsl.escrever("elementosForm:sobrenome", sobrenome);
    }
    public void setSexoMasculino() {
        dsl.clicarRadio("ElementosForm:Sexo:0");
    }
    public void setComidaCarne() {
        dsl.clicarRadio("elementosForm:comidaFavorita:0");
    }
    public void setEscSuperior(String valor) {
        dsl.interagirCombo("elementosForm:escolaridade",valor);
    }
    public void setEsporte(String valor){
        dsl.interagirCombo("elementosForm:esportes", valor);
    }
    public void setCadastrar(){
        dsl.Cadastrar("elementosForm:cadastrar");
    }
    public String setObterNomeCadastro() {
        return dsl.obterValorCampo("elementosForm:nome");
    }
    public String setObterSobrenomeCadastro() {
        return dsl.obterValorCampo("elementosForm:sobrenome");
    }
    public boolean setObterCampoSexo() {
        return dsl.isRadioMarcador("elementosForm:sexo:0");
    }
    public boolean setObterCampoComida() {
        return dsl.isRadioMarcador("elementosForm:comidaFavorita:0");
    }
    public String setObterCampoEscolaridade() {
        return dsl.obterValorCombo("elementosForm:escolaridade");
    }
    public String setObterValorEsporte() {
        return dsl.obterValorCombo("elementosForm:esportes");
    }
}
