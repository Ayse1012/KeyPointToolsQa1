package com.toolsAndSauce.step_definitions;

import com.toolsAndSauce.utilities.Driver;
import io.cucumber.java.Before;
import org.junit.After;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
    @After
    public void tearDown()  {

        Driver.closeDriver();
    }


}
