package com.github.tests;
import com.github.config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GithubWebTests extends TestBase {

    @Test
    void checkSolutionNameTest() {

        open("https://github.com");
        $(".header-menu-wrapper").$(byText("Solutions")).click();
        $(".border-bottom").$(byText("Enterprise")).click();
        $(".eyebrow-banner").sibling(1).shouldHave(text("Build like the best"));
    }
}
