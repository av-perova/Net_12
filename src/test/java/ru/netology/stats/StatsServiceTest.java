package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void minSalesMonthTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 7, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMohth = service.minSalesMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMohth);
    }

    @Test
    public void maxSalesMonthTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSalesMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void lastMonthWhenSalesBelowAverageTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 4, 18};

        int expectedMonth = 11;
        int actualMonth = service.lastMonthWhenSalesBelowAverage(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void lastMonthWhenSalesAboveAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 4, 18};

        int expectedMonth = 12;
        int actualMohth = service.lastMonthWhenSalesAboveAverage(sales);

        Assertions.assertEquals(expectedMonth, actualMohth);
    }
}
