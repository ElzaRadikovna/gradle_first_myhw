package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    @Test
   public void cashbackIfOver1000() {

        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(1600);
        int expected = 400;

        Assert.assertEquals(actual, expected);


    }
    @Test
    public void cashbackIfUnder1000() {

        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(850);
        int expected = 150;

        Assert.assertEquals(actual, expected);


    }
    @Test
    public void cashbackIfEqual1000() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);



    }
}
