package ru.stqa.training.selenium.LiteCart;

public class LoginData {
    private final String name;
    private final String pass;

    public LoginData(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }
}
