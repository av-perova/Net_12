package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sum = 0;

        for (int s : sales) {
            sum = sum + s;
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int average = sumSales(sales) / sales.length;
        return average;
    }

    public int minSalesMonth(int[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int maxSalesMonth(int[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int lastMonthWhenSalesBelowAverage(int[] sales) {
        int month = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales(sales)) {
                month = i;
            }
        }
        return month + 1;
    }

    public int lastMonthWhenSalesAboveAverage(int[] sales) {
        int month = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales(sales)) {
                month = i;
            }
        }
        return month + 1;
    }
}
