# Projeto Automação Teste Funcional



## Objetivo

O projeto consiste na automação de teste funcional de um formulario Web, validando campos especificos para cadastrar as informações de um usuario.

### Teste de interface web

/src/mais/resources/componentes.html

```
Exemplos
```

### Dados que serão inseridos

*Nome: Otto
*Sobrenome: Caldas
*Sexo: M
*Comida Favorita: Carne
*Escolaridade: Superior
*Esporte que pratica: Futebol
*Finalizar o cadastro.

```
Teste 1
```

Efetuar o Cadastro.

```
Teste 2
```

Validaremos as regras de negocio exigidas que são:
- Campo Nome é Obrigatório.
- Campo Sobrenome é Obrigatório.
- Campo Sexo precisa esta marcado.
- Não pode validar como comida favorita Carne e Vegetariano simultaneamente, deve-se
exibir a mensagem: "Tem certeza que voce eh vegetariano?"
- Não pode validar como esporte alguma categoria de esporte e a pergunta "O que eh esporte?" 
simultaneamente, deve-se exibir a mensagem "Voce pratica mesmo algum esporte?".

## Configurações:

Foi desenvolvido em Java.
Dependencias: Junit e Selenium.
IDE: Intellij IDE
Nescessário baixar o Chromedriver. Foi usado o navegador Google Chrome Versão 86.0.4240.183 (Versão oficial) 64 bits
Obs. Verifique a versão do seu navegador chrome e baixe o Chromedriver de acordo com a versão. Link para download do Chromedriver: [ChromeDriver(]http://chromedriver.chromium.org/downloads)
Após baixar, recomendo que crie uma pasta com o nome Temp e dentro dela crie outra pasta com nome drivers no diretorio c.(Windows), ou em /home/usuario/drivers (Linux .deb)

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc

