package main;

import idAndPassword.IDAndPassword;
import loginPage.LoginPage;

public class Main {
    public static void main(String[] args) {

        IDAndPassword idAndPasswords = new IDAndPassword();
        LoginPage loginPage = new LoginPage(idAndPasswords.getLoginInfo());
    }
}
