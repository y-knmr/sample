package com.mumian.sample.scenario;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Selenide;

public class ScenarioTest {
	@Test
	public void test() {
		Selenide.open("http://localhost:8080/sample");
		$(By.id("userName")).setValue("test");
		$(By.id("password")).setValue("test");
	}
}
