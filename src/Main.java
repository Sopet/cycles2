public class Main {
    public static void main(String[] args) {


        System.out.println("Задача 1");
        int salary = 0;
        int month = 0;
        while (salary < 2_440_000) {
            salary += 15000;
            month ++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + salary + " рублей");
        }
        if (salary != 2_459_000) {
            salary += 14000;
            month ++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + salary + " рублей");
        }


        System.out.println("\nЗадача 2");
        int num = 0;
        while (num < 10) {
            num += 1;
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num10 = 10; num10 != 0; num10 -= 1) {
            System.out.print(num10 + " ");
        }


        System.out.println("\n\nЗадача 3");
        int countryY = 12_000_000;
        int year = 0;
        int birthRate = 17;
        int mortality = 8;
        while (year < 10) {
            year += 1;
            countryY += countryY * birthRate / 1000 - countryY * mortality / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + countryY);
        }


        System.out.println("\nЗадача 4");
        int depositAmount = 15000;
        int total = 0;
        int months = 0;
        while (total < 12_000_000) {
            total += total * 7 / 100 + depositAmount;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений составляет " + total + " рублей");
        }


        System.out.println("\nЗадача 5");
        int deposit = 15000;
        int totals = 0;
        int monthsPeriod = 0;
        while (totals < 12_000_000) {
            totals += totals * 7 / 100 + deposit;
            monthsPeriod++;
            if (monthsPeriod % 6 == 0) {
                System.out.println("Месяц " + monthsPeriod + ", сумма накоплений составляет " + totals + " рублей");
            }
        }


        System.out.println("\nЗадача 6");
        int bank = 15000;
        int sum = 0;
        int period = 0;
        while (period != 108) {
            sum += sum * 7 / 100 + bank;
            period++;
            if (period % 6 == 0) {
                System.out.println("Месяц " + period + ", сумма накоплений составляет " + sum + " рублей");
            }
        }


        System.out.println("\nЗадача 7");
        int days = 7;
        int monthsDay = 31;
        int friday = 5;
        System.out.println("Сегодня пятница, " + friday + "-е число");
        while (friday < monthsDay) {
            friday += days;
            if (friday < monthsDay) {
                System.out.println("Сегодня пятница, " + friday + "-е число");
            }
        }


        System.out.println("\nЗадача 8");
        int firstYear = 0;
        int nextPeriod = 79;
        int ourYear = 2025;
        int beforeYear = ourYear - 200;
        while (firstYear < ourYear) {
            firstYear += nextPeriod;
            if (beforeYear < firstYear) {
                System.out.println(firstYear);
            }
        }
    }
}