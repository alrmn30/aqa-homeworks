package ru.netology.service;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void test1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void test2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;

        int expected = 900;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void test3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }


}