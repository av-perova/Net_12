package ru.netology.stats;

public class Main {

    public static void main(String[] args) {
        int[] sales = {2, 1, 13, 15, 1, 20, 19, 23, 7, 14, 14, 15};

        StatsService service = new StatsService();

        System.out.println("Сумма всех продаж " + service.sumSales(sales));
        System.out.println("Средняя сумма продаж в месяц " + service.averageSales(sales));
        System.out.println("Максимум продаж в " + service.maxSalesMonth(sales) + " месяц");
        System.out.println("Минимум продаж в " + service.minSalesMonth(sales) + " месяц");
        System.out.println("Последний месяц когда продажи были ниже среднего " + service.lastMonthWhenSalesBelowAverage(sales));
        System.out.println("Последний месяц когда продажи были выше среднего " + service.lastMonthWhenSalesAboveAverage(sales));
    }
}
