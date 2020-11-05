# testeSelenium
# Projeto Automação Teste Funcional



## Objetivo

O projeto consiste na automação de teste funcional de um formulario Web, validando campos especificos para cadastrar as informações de um usuario.

### Teste de interface web

/src/mais/resources/componentes.html


### Dados que serão inseridos

- Nome: Otto
- Sobrenome: Caldas
- Sexo: M
- Comida Favorita: Carne
- Escolaridade: Superior
- Esporte que pratica: Futebol
- Finalizar o cadastro.


## Teste 1

Efetuar o Cadastro.


## Teste 2


Validaremos as regras de negocio exigidas que são:
- Campo Nome é Obrigatório.
- Campo Sobrenome é Obrigatório.
- Campo Sexo precisa esta marcado.
- Não pode validar como comida favorita Carne e Vegetariano simultaneamente, deve-se
exibir a mensagem: "Tem certeza que voce eh vegetariano?"
- Não pode validar como esporte alguma categoria de esporte e a pergunta "O que eh esporte?" 
simultaneamente, deve-se exibir a mensagem "Voce pratica mesmo algum esporte?".

## Configurações:

Foi desenvolvido em ```Java```. <p>
Dependencias: ```Junit``` e ```Selenium```.<p>
IDE: ```Intellij IDE```<p>
Nescessário baixar o Chromedriver. Foi usado o navegador Google Chrome Versão 86.0.4240.183 (Versão oficial) 64 bits<p>
Obs. Verifique a versão do seu navegador chrome e baixe o Chromedriver de acordo a sua versão.
Link para download do Chromedriver:http://chromedriver.chromium.org/downloads<p>
Após baixar, recomendo que crie uma pasta com o nome Temp e dentro dela crie outra pasta com nome drivers no diretorio c.(Windows), ou em /home/usuario/drivers (Linux .deb)
