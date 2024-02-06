package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    void cashbackIfOver1000() {

        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(1600);
        int expected = 400;

        Assert.assertEquals(actual, expected);


    }
    @Test
    void cashbackIfUnder1000() {

        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(850);
        int expected = 150;

        Assert.assertEquals(actual, expected);


    }
    @Test
    void cashbackIfEqual1000() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);



    }
}
