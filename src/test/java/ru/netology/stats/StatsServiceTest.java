package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalcAmount() {
        StatsService service = new StatsService(); // сумма продаж за год
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calcAmount(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calcAverageAmountSale() { // средняя сумма продаж в мес
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        double actual = service.calcAverageAmountSale(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthMaxSale() { //последний месяц с пиком продаж
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calcMonthMaxSale(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthMinSale() { //последний месяц с минимумом продаж
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calcMonthMinSale(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calcUnAverageAmountSale() { // количество мес, где продажи были меньше средней
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        double actual = service.calcUnAverageAmountSale(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calcUpAverageAmountSale() { // количество мес, где продажи были больше средней
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        double actual = service.calcUpAverageAmountSale(sales);
        assertEquals(expected, actual);
    }
}
