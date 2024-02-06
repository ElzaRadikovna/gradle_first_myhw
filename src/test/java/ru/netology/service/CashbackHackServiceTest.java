package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

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

        int actual = cashbackHackService.remain(950);
        int expected = 50;

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
