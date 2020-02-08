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
        navegador.findElement(By.id("loginEmail")).sendKeys("vcfreitas1997@gmail.com");
        navegador.findElement(By.id("loginPassword")).sendKeys("12345678");
        navegador.findElement(By.id("formLogin"));
        navegador.findElement(By.id("btn-login")).click();
        ChromeOptions options = new ChromeOptions();


    }

}
