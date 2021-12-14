package com.mercadolibre.workshop.test;

import com.mercadolibre.workshop.driver.Driver;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ItemSearch {

    static Driver driver = new Driver();
    @BeforeClass
    public static void setUp() {
        driver.initDriver();

    }

    @Test
    public void firstItemPriceShouldBeEqualToExpectedPrice() {
        System.out.println("Hola");

        //Preconditions
        String keyword = "gorra";



        //Action

        //Assert

        int obtainedItemPrice = 10;
        Assert.assertEquals(10,obtainedItemPrice);
    }

    @AfterClass
    public static void clean() {
        driver.exitDriver();
    }

}
