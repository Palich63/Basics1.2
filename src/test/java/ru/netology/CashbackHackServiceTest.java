package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService test = new CashbackHackService();

    @Test
    public void shouldTestMoreRemain() {
        // Сумма покупки менее 999$, требуется докупить
        int expected = 1;
        int actual = test.remain(999);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRightRemain() {
        // Сумма покупки 1000$, докупать не требуется
        int expected = test.remain(1000);
        int actual = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMoreAndMoreRemain() {
        // Сумма покупки 1001$, требуется докупить
        int expected = test.remain(1001);
        int actual = 999;
        assertEquals(expected, actual);
    }
}