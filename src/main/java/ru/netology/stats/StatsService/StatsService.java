package ru.netology.stats.StatsService;

public class StatsService {
    public long amount(long[] sales) {
        long price = 0;
        for (long sale : sales) {
            price += sale;
        }
        return price;
    }

    public long average(long[] sales) {
        long price = amount(sales);
        return price / 12;
    }

    public long numberMax(long[] sales) {
        long month = 0;
        long max = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= max) {
                max = sales[i];
                month = i;
            }

        }
        return month + 1;
    }

    public long numberMin(long[] sales) {
        long month = 0;
        long min = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= min) {
                min = sales[i];
                month = i;
            }

        }
        return month + 1;
    }

    public long salesMin(long[] sales) {
        long averageSale = average(sales);
        long all = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                all++;
            }
        }
        return all;
    }

    public long salesMax(long[] sales) {
        long averageSale = average(sales);
        long all = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                all++;
            }
        }
        return all;
    }

}


