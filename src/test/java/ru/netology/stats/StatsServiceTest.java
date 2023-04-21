package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void countSumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void countAverageSumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverageSum = 15;
        long actualAverageSum = service.averageSumSales(sales);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    public void findMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxDay = 8;
        int actualMaxDay = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxDay, actualMaxDay);
    }

    @Test
    public void findMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinDay = 9;
        int actualMinDay = service.minSales(sales);

        Assertions.assertEquals(expectedMinDay, actualMinDay);
    }

    @Test
    public void daysMinAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDaysMinAverage = 5;
        int actualDaysMinAverage = service.minAverageSales(sales);

        Assertions.assertEquals(expectedDaysMinAverage, actualDaysMinAverage);
    }

    @Test
    public void daysMaxAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDaysMaxAverage = 5;
        int actualDaysMaxAverage = service.maxAverageSales(sales);

        Assertions.assertEquals(expectedDaysMaxAverage, actualDaysMaxAverage);
    }
}
