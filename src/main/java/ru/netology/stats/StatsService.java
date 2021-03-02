package ru.netology.stats;

public class StatsService {
    public int sum(int[] purchase) {
        int totalSum = 0;
        for (int sum : purchase) {
            totalSum += sum;
        }
        return totalSum;
    }

    public float average(int[] purchase) {
        int sum = 0, temp = 0;
        float average;
        for (int a : purchase) {
            sum += a;
            temp++;
        }
        average = (float) sum / temp;
        return average;
    }

    public int numberMonthsOfMaxSales(int[] purchase) {
        int a = 0, max_month = 0, number_month = 0;
        for (int month : purchase) {
            a++;
            if (max_month <= month) {
                max_month = month;
                number_month = a;
            }
        }
        return number_month;
    }

    public int numberMonthsOfMinSales(int[] purchase) {
        int temp = 0, minMonth = purchase[0], numberMonth = 1;
        for (int month : purchase) {
            temp++;
            if (minMonth >= month) {
                minMonth = month;
                numberMonth = temp;
            }
        }
        return numberMonth;
    }


    public int numberOfMonthsSalesLowerAverage(int[] purchase) {
        int sum = 0, temp = 0, numberOfMonths = 0;
        float average;
        for (int b : purchase) {
            sum += b;
            temp++;
        }
        average = (float) sum / temp;
        for (int b : purchase) {
            if (b < average) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }

    public int numberOfMonthsSalesAboveAverage(int[] data) {
        int sum = 0, temp = 0, numberOfMonths = 0;
        float average;
        for (int b : data) {
            sum += b;
            temp++;
        }
        average = (float) sum / temp;
        for (int b : data) {
            if (b > average) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }
}
