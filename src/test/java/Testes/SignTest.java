package Testes;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class SignTest {
    @Test
    public void testFazerLoginNoSambaPlay(){ //criando um método para fazer login na página

      System.setProperty("webdriver.chrome.driver","C:\\Users\\Driver\\chromedriver.exe"); //Buscando pelo meu arquivo Webdriver
        WebDriver navegador = new ChromeDriver(); // esta linha irá abrir meu browser
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        navegador.get("https://neon.sambaplay.tv/"); // solicitando que meu webdriver acesse a página da sambaplay.tv
        navegador.findElement(By.id("header-sign-in-btn")).click(); //procurando pelo elemento com o id "header-sign-in-btn" e executando a função de click;
        navegador.findElement(By.id("loginEmail")).sendKeys("vcfreitas1997@gmail.com"); //preenchendo o campo de login com meu e-mail
        navegador.findElement(By.id("loginPassword")).sendKeys("12345678");  //preenchendo a senha
        navegador.findElement(By.id("formLogin"));  //procurando pelo elemento de formulário de login
        navegador.findElement(By.id("btn-login")).click(); //procurando pelo botão de login e executando a função de click
        ChromeOptions options = new ChromeOptions();


    }

}
