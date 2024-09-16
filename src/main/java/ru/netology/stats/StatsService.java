package ru.netology.stats;

public class StatsService {
    public long amountSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long averageSales(long[] sales) {
        //long totalSale = 0;
        //for (long sale : sales) {
        //    totalSale += sale;
        //}
        //   long average = totalSale / 12;
        //   return average;


        //long totalSale = amountSales(sales);
        // long average = totalSale / 12;
        //return average;

        //long average = amountSales(sales) / 12;
        //return average;

        return amountSales(sales) / sales.length;

    }

    public int maxMonthSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minMonthSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthsBellowAverage(long[] sales) {
        int counter = 0;
        long average = amountSales(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsAboveAverage(long[] sales) {
        int counter = 0;
        long average = amountSales(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;
    }
}
