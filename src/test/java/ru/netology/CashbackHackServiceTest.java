package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {

    CashbackHackService test = new CashbackHackService();

    @Test
    public void shouldTestMoreRemain() {
        // Сумма покупки менее 999$, требуется докупить
        int actual = test.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRightRemain() {
        // Сумма покупки 1000$, докупать не требуется
        int actual = test.remain(1000);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestMoreAndMoreRemain() {
        // Сумма покупки 1001$, требуется докупить
        int actual = test.remain(1001);
        int expected = 999;
        assertEquals(actual, expected);
    }

}