package ru.netology.stats;

public class StatsService {

    public int salesAmount(int[] arrSale) { // Метод для подсчета суммы всех продаж
        int sum = 0;
        for (int currentSum : arrSale) {
            sum = sum + currentSum;
        }
        return sum;
    }

    public double averageSalesAmount(int[] arrSale) { // Метод для подсчета средний суммы продаж в месяц
        double averageSum = 0;

        for (double currentSum : arrSale) {
            averageSum = averageSum + currentSum;
        }
        return averageSum / arrSale.length;
    }

    public int maxSales(int[] arrSale) {   // Метод для рассчета месяца с пиком продаж
        int maxMonth = 0;
        int month = 0;
        for (int sale : arrSale) {
            if (sale >= arrSale[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] arrSale) {   // Метод для рассчета месяца с минимумом продаж
        int minMonth = 0;
        int month = 0;
        for (int sale : arrSale) {
            if (sale <= arrSale[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int bellowAverageSales(int[] arrSale) {
        double averageSum = averageSalesAmount(arrSale);
        int numberMonth = 0;
        for (double month : arrSale) {
            if (month < averageSum) {
                numberMonth++;
            }
        }
        return numberMonth;
    }

    public int upperAverageSales(int[] arrSale) {
        double averageSum = averageSalesAmount(arrSale);
        int numberMonth = 0;
        for (double month : arrSale) {
            if (month > averageSum) {
                numberMonth++;
            }
        }
        return numberMonth;
    }

}
