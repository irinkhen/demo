package com.example.demo;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class NewPageTest {

    @Test
    public void openGoogle() {
        open("https://www.google.ru");
    }
}
