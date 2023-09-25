package com.crackelets.bigfun.platform.cucumber;

import com.crackelets.bigfun.platform.BigFunApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = BigFunApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = BigFunApplication.class,
        loader = SpringBootContextLoader.class)

public class CucumberSpringConfiguration {
}
