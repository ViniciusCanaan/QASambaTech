package Testes;
import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Cadastro {

    @Test
    public void testFazerCadastro(){ //criando um método para fazer login na página

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Driver\\chromedriver.exe"); //Buscando pelo meu arquivo Webdriver
        WebDriver navegador = new ChromeDriver(); // esta linha irá abrir meu browser
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        navegador.get("https://neon.sambaplay.tv/"); // solicitando que meu webdriver acesse a página da sambaplay.tv
        navegador.findElement(By.id("header-sign-in-btn")).click(); //procurando pelo elemento com o id "header-sign-in-btn" e executando a função de click;
        navegador.findElement(By.id("register-button-login-page")).click(); //procurando pelo elemento com o id "register-button-login-page" e executando a função de click de registro.
        navegador.findElement(By.name("name")).sendKeys("Vinícius Canaan"); // preenchendo meu nome
        navegador.findElement(By.id("registerEmail")).sendKeys("vcfreitas1997@gmail.com"); // preenchendo meu e-mail
        navegador.findElement(By.id("registerConfEmail")).sendKeys("vcfreitas1997@gmail.com"); // preenchendo o confirmamento do e-mail
        navegador.findElement(By.id("registerPassword")).sendKeys("12345678"); // preenchendo minha senha
        navegador.findElement(By.id("registerConfPassword")).sendKeys("12345678"); // preenchendo o confirmamento de senha


        ChromeOptions options = new ChromeOptions();

    }
}
