package ru.netology.stats;

public class StatsService {

    public int calcAmount(int[] sales) { // сумма всех продаж
        int amount = 0;
        for (int sale : sales) {
            amount += sale;
        }
        return amount;
    }

    public double calcAverageAmountSale(int[] sales) { // средняя сумма продаж в месяц
        return calcAmount(sales) / sales.length;

    }

    public int calcMonthMaxSale(int[] sales) { // месяц, в который был пик продаж
        int MonthMaxSale = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[MonthMaxSale] <= sales[i]) {
                MonthMaxSale = i;
            }
        }
        MonthMaxSale += 1;
        return MonthMaxSale;
    }

    public int calcMonthMinSale(int[] sales) { // месяц с минимальными продажами
        int MonthMinSale = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[MonthMinSale] >= sales[i]) {
                MonthMinSale = i;
            }
        }
        MonthMinSale += 1;
        return MonthMinSale;
    }

    public int calcUnAverageAmountSale(int[] sales) { //количество месяцев, где продажи были меньше средних
        int count = 0;
        double averageAmountSale = calcAverageAmountSale(sales);
        for (int sale : sales) {
            if (sale < averageAmountSale) {
                count = count + 1;
            }
        }
        return count;
    }

    public int calcUpAverageAmountSale(int[] sales) { // количество месяцев, где продажи были больше средних
        int count = 0;
        double averageAmountSale = calcAverageAmountSale(sales);
        for (int sale : sales) {
            if (sale > averageAmountSale) {
                count = count + 1;
            }
        }
        return count;
    }

}