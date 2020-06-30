package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService test = new CashbackHackService();

    @Test
    public void shouldTestMoreRemain() {
        // Сумма покупки менее 999$, требуется докупить
        int actual = test.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRightRemain() {
        // Сумма покупки 1000$, докупать не требуется
        int expected = 0;
        int actual = test.remain(1000);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMoreAndMoreRemain() {
        // Сумма покупки 1001$, требуется докупить
        int expected = 999;
        int actual = test.remain(1001);
        assertEquals(expected, actual);
    }
}