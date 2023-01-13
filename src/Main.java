public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1:");
        int countMonth = 0;
        int deposit = 15000;
        int sum = 0;
        while (sum <= 2_459_000) {
            sum = sum + deposit;
            countMonth++;
        }
        System.out.println("Месяц " + countMonth + ", сумма накоплений равна " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("\nЗадача 2:");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("\nЗадача 3:");
        int populationY = 12_000_000;
        int birthRate = 0;
        int mortality = 0;
        for (int year = 1; year <=10; year++) {
            birthRate = populationY / 1000 * 17;
            mortality = populationY / 1000 * 8;
            populationY = populationY + birthRate - mortality;
            System.out.println("Год " + year + ", численность населения составляет " + populationY);
        }
    }

    public static void task4() {
        System.out.println("\nЗадача 4:");
        int deposit = 0;
        int sum = 15000;
        int countOfMonth = 0;
        while (deposit <= 12_000_000) {
            deposit = deposit + sum + (deposit / 100 * 7);
            countOfMonth++;
            System.out.println("Месяц " + countOfMonth + ", сумма накоплений равна " + deposit + " рублей");
        }
    }

    public static void task5() {
        System.out.println("\nЗадание 5:");
        int deposit = 0;
        int sum = 15000;
        int countOfMonth = 0;
        while (deposit <= 12_000_000) {
            deposit = deposit + sum + (deposit / 100 * 7);
            countOfMonth++;
            if (countOfMonth % 6 == 0) {
                System.out.println("Месяц " + countOfMonth + ", сумма накоплений равна " + deposit + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("\nЗадание 6:");
        int deposit = 0;
        int sum = 15000;
        int countOfMonth = 0;
        while (countOfMonth <= 108) {
            deposit = deposit + sum + (deposit / 100 * 7);
            countOfMonth++;
            if (countOfMonth % 6 == 0) {
                System.out.println("Месяц " + countOfMonth + ", сумма накоплений равна " + deposit + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("\nЗадание 7:");
        int friday = 6;
        for (; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет!");
        }
    }

    public static void task8() {
        System.out.println("\nЗадание 8:");
        int yearBefore = 1823;
        int yearAfter = 2123;
        for (int i = 0; i <= yearAfter; i = i + 79) {
            if (i >= yearBefore) {
                System.out.println(i);
            }
        }
    }


}