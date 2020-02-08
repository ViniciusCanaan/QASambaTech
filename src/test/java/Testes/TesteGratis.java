package Testes;
import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class TesteGratis {

        @Test
        public void testTesteGratis(){ //criando um método para fazer login na página

            System.setProperty("webdriver.chrome.driver","C:\\Users\\Driver\\chromedriver.exe"); //Buscando pelo meu arquivo Webdriver
            WebDriver navegador = new ChromeDriver(); // esta linha irá abrir meu browser
            navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            navegador.get("https://neon.sambaplay.tv/"); // solicitando que meu webdriver acesse a página da sambaplay.tv
            navegador.findElement(By.id("header-sign-in-btn")).click(); //procurando pelo elemento com o id "header-sign-in-btn" e executando a função de click;
            navegador.findElement(By.id("loginEmail")).sendKeys("vcfreitas1997@gmail.com");//preenchendo meu e-mail
            navegador.findElement(By.id("loginPassword")).sendKeys("12345678"); //preenchendo minha senha
            navegador.findElement(By.id("formLogin")); // buscando pelo formulário de login
            navegador.findElement(By.id("btn-login")).click(); //solicitando que faça o clique no botão de login
            navegador.findElement(By.linkText("Conteúdo")).click(); //indo para a tela de conteúdo
            navegador.findElement(By.id("cta_subscription_trial")).click(); // inscrevendo para o teste grátis
            navegador.findElement(By.id("menuBoleto")).click(); //entrando na tela de pagamento por boleto
            navegador.findElement(By.id("cpf")).sendKeys("21167297504"); //preenchendo meu cpf
            navegador.findElement(By.id("btn-finish-payment-boleto")).click(); //finalizando a geração de boleto.
            ChromeOptions options = new ChromeOptions();


        }
}
