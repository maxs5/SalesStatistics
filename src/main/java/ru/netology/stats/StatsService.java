package ru.netology.stats;

public class StatsService {

    public int calculateSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage(long[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int calculateMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;

    }

    public int calculateMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;

    }

    public int calculateLowAverage(long[] sales) {
        int avg = calculateAverage(sales);
        int lowMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale < avg) {
                lowMonth++;
            }
            month = month + 1;
        }
        return lowMonth;
    }


    public int calculateHighAverage(long[] sales) {
        int avg = calculateAverage(sales);
        int highMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale > avg) {
                highMonth++;
            }
            month = month + 1;
        }
        return highMonth;
    }

}