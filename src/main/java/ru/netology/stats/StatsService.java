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
        int sum = 0;
        int average = 0;

        for (int s : sales) {
            sum = sum + s;
        }
        average = sum / sales.length;
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
        int average = 0;
        int sum = 0;

        for (int s : sales) {
            sum = sum + s;
        }
        average = sum / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                month = i;
            }
        }
        return month + 1;
    }

    public int lastMonthWhenSalesAboveAverage(int[] sales) {
        int month = 0;
        int average = 0;
        int sum = 0;

        for (int s : sales) {
            sum = sum + s;
        }
        average = sum / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                month = i;
            }
        }
        return month + 1;
    }

}
