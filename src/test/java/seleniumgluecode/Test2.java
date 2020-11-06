package seleniumgluecode;

import Aditionals.ReadExcel;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test2 extends TestBase{
    private ChromeDriver driver=Hooks.getDriver();
    private BasePage basePage=new BasePage(driver);

    @Given("^El usuario ingresa en la pagina customers$")
    public void el_usuario_ingresa_en_la_pagina_customers() throws Throwable {

        WebElement user = driver.findElement(homePage.getUser());
        WebElement pass = driver.findElement(homePage.getPass());
        WebElement btnLogin = driver.findElement(homePage.getBtnLogin());
        basePage.click(homePage.getUser());
        //user.click();
        user.sendKeys(homePage.getLogin());
        pass.sendKeys(homePage.getPassw());
        basePage.click(homePage.getBtnLogin());
        //btnLogin.click();

        WebElement menuAdmin = driver.findElement(homePage.getMenuAdmin());

        Actions action = new Actions(driver);
        action.moveToElement(menuAdmin).build().perform();
        WebElement menuProject = driver.findElement(homePage.getMenuProject());
        action.moveToElement(menuProject).build().perform();
        WebElement menuCustomer = driver.
                findElement(homePage.getMenuCustomer());
        action.moveToElement(menuCustomer).build().perform();
        basePage.click(homePage.getMenuCustomer());
        //menuCustomer.click();

    }
    @When("^El usuario ingresa los datos de name y desc da click al boton save$")
    public void el_usuario_ingresa_los_datos_de_name_y_desc_da_click_al_boton_save() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        List nombre, desc;
        ReadExcel excel = new ReadExcel();
        excel.leerExcel();
        nombre = excel.getNombre();
        desc = excel.getDesc();
        Iterator name = nombre.iterator();
        int i = -1;


        driver.switchTo().frame(driver.findElement(homePage.getRightMenu()));
        while (name.hasNext()) {
            i++;
            //driver.findElement(homePage.getBtnAdd()).click();
            basePage.click(homePage.getBtnAdd());

            WebElement nameCustomer = driver.
                    findElement(homePage.getName());
            nameCustomer.sendKeys(name.next().toString());
            WebElement desCustomer = driver.
                    findElement(homePage.getDesc());
            desCustomer.sendKeys(desc.get(i).toString());

            basePage.click(homePage.getBtnSave());
            //driver.findElement(homePage.getBtnSave()).click();
            // System.out.println(name.next());
        }
    }
    @Then("^Se debe mostrar mensaje registro exitoso$")
    public void se_debe_mostrar_mensaje_registro_exitoso() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement msg = driver.findElement(homePage.getMsgFinal());
        Assert.assertTrue(msg.isDisplayed());
    }

}
