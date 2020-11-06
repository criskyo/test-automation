package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

    private By user = By.id("txtUsername");
    private By pass = By.id("txtPassword");
    private By btnLogin = By.id("btnLogin");
    protected String login = "opensourcecms";
    protected String passw = "opensourcecms";
    protected String passwe = "opensourcecms1";
    private By logoHeader = By.id("companyLogoHeader");
    private By message = By.id("spanMessage");
    private By find = By.id("frmLogin");
    private By menuAdmin = By.id("admin");
    private By menuProject = By.xpath("//*[@id=\"admin\"]/ul/li[8]/a");
    private By menuCustomer = By.xpath("//*[@id=\"admin\"]/ul/li[8]/ul/li[1]/a");
    private By rightMenu = By.xpath("//*[@id=\"rightMenu\"]");
    private By btnAdd = By.id("btnAdd");
    private By name = By.name("addCustomer[customerName]");
    private By desc = By.name("addCustomer[description]");
    private By btnSave = By.id("btnSave");
    private By msgFinal = By.className("messageBalloon_success");

    public By getBtnLogin() {
        return btnLogin;
    }

    public By getPass() {
        return pass;
    }

    public By getUser() {
        return user;
    }

    public String getLogin() {
        return login;
    }

    public String getPassw() {
        return passw;
    }

    public By getLogoHeader() {
        return logoHeader;
    }

    public By getFind() {
        return find;
    }

    public By getMessage() {
        return message;
    }

    public By getMenuAdmin() {
        return menuAdmin;
    }

    public By getMenuProject() {
        return menuProject;
    }

    public By getMenuCustomer() {
        return menuCustomer;
    }

    public By getRightMenu() {
        return rightMenu;
    }

    public By getBtnAdd() {
        return btnAdd;
    }

    public By getName() {
        return name;
    }

    public By getDesc() {
        return desc;
    }

    public By getBtnSave() {
        return btnSave;
    }

    public By getMsgFinal() {
        return msgFinal;
    }

    public String getPasswe() {
        return passwe;
    }
}
