package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void cashbackIfOver1000() {
        int amount = 1600;

        int actual = service.remain(amount);
        int expected = 400;

        Assert.assertEquals(actual, expected);


    }

    @Test
    public void cashbackIfUnder1000() {
        int amount = 950;

        int actual = service.remain(amount);
        int expected = 50;

        Assert.assertEquals(actual, expected);


    }

    @Test
    public void cashbackIfEqual1000() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);


    }
}
