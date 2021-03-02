package ru.netology.stats;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void sum() {
        StatsService servise = new StatsService();
        int exp = 180;
        int act = servise.sum(purchase);
        assertEquals(exp, act);
    }

    @Test
    public void average() {
        StatsService servise = new StatsService();
        float exp = 15;
        float act = servise.average(purchase);
        assertEquals(exp, act);
    }

    @Test
    public void numberMonthsOfMaxSales() {
        StatsService servise = new StatsService();
        int exp = 8;
        int act = servise.numberMonthsOfMaxSales(purchase);
        assertEquals(exp, act);
    }

    @Test
    public void numberMonthsOfMinSales() {
        StatsService servise = new StatsService();
        int exp = 9;
        int act = servise.numberMonthsOfMinSales(purchase);
        assertEquals(exp, act);
    }

    @Test
    public void numberOfMonthsSalesBelowAverage() {
        StatsService servise = new StatsService();
        int exp = 5;
        int act = servise.numberOfMonthsSalesLowerAverage(purchase);
        assertEquals(exp, act);
    }

    @Test
    public void numberOfMonthsSalesAboveAverage() {
        StatsService servise = new StatsService();
        int exp = 5;
        int act = servise.numberOfMonthsSalesAboveAverage(purchase);
        assertEquals(exp, act);
    }
}
