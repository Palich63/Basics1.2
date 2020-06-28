package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService test = new CashbackHackService();

    @Test
    public void shouldTestMoreRemain() {
        // Сумма покупки менее 999$, требуется докупить
        int actual = 1;
        int expected = test.remain(999);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRightRemain() {
        // Сумма покупки 1000$, докупать не требуется
        int expected = test.remain(1000);
        int actual = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestMoreAndMoreRemain() {
        // Сумма покупки 1001$, требуется докупить
        int expected = test.remain(1001);
        int actual = 999;
        assertEquals(actual, expected);
    }
}