package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            sumMonth = sumMonth + sales[i];
        }
        return sumMonth;
    }

    public long averageSumSales(long[] sales) {
        long averageSumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            averageSumSales = sumSales(sales) / sales.length;
        }
        return averageSumSales;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int minAverageSales(long[] sales) {
        int minAverageSales = 0;
        int minDayAverage = (int) averageSumSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < minDayAverage) {
                minAverageSales++;
            }
        }

        return minAverageSales;
    }

    public int maxAverageSales(long[] sales) {
        int maxAverageSales = 0;
        int maxDayAverage = (int) averageSumSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > maxDayAverage) {
                maxAverageSales++;
            }
        }

        return maxAverageSales;
    }
}
