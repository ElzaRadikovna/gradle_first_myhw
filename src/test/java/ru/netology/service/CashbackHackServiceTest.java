package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

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
        int amount = 850;

        int actual = service.remain(amount);
        int expected = 150;

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
