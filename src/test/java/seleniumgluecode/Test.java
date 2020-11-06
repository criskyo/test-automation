package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.HomePage;

public class Test extends TestBase {
    private ChromeDriver driver = Hooks.getDriver();
    private BasePage basePage = new BasePage(driver);

    @Given("^El usuario se encuentra en la pagina de inicio de sesion de Orange HRM$")
    public void el_usuario_se_encuentra_en_la_pagina_de_inicio_de_sesion_de_Orange_HRM() throws Throwable {


    }

    @When("^El usuario ingresa sus datos de username y password y da click al boton login$")
    public void el_usuario_ingresa_sus_datos_de_username_y_password_y_da_click_al_boton_login() throws Throwable {

        WebElement user = driver.findElement(homePage.getUser());
        WebElement pass = driver.findElement(homePage.getPass());
        //WebElement btnLogin = driver.findElement(homePage.getBtnLogin());
        basePage.click(homePage.getUser());

        //user.click();
        user.sendKeys(homePage.getLogin());
        pass.sendKeys(homePage.getPassw());
        basePage.click(homePage.getBtnLogin());
        //btnLogin.click();
    }

    @Then("^Se debe redirigir a la página home del usuario$")
    public void se_debe_redirigir_a_la_página_home_del_usuario() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        WebElement find = driver.findElement(homePage.getLogoHeader());
        Assert.assertTrue(find.isDisplayed());
        driver.close();
    }
}
